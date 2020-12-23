package com.zhengsr.opshelper

import android.annotation.TargetApi
import android.app.AppOpsManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import com.jaredrummler.android.shell.Shell

/**
 * @author by zhengshaorui 2020/12/15 10:27
 * describe：权限收集
 */
typealias RequestListener = (Boolean, String) -> Unit

open class OpsRequest(private val context: Context, private val pkg: String) {
    private val TAG = "OpsRequest"

    /**
     * 准备允许的权限属性
     */
    private var permissions: List<String>? = null
    private var listener: RequestListener? = null
    fun permissions(vararg permissions: String): OpsRequest {
        this.permissions = permissions.toList()
        return this
    }

    fun request(listener: RequestListener) {
        this.listener = listener
        try {
            permissions?.let {
                var isAllOk = true
                for (permission in it) {
                    val isOk = setOpAllow( pkg, permission)
                    if (!isOk) {
                        isAllOk = false
                        break
                    }
                }
                if (isAllOk) {
                    val infoList = PermissionUtils.getApplicationPermission(context, pkg, it)
                    infoList?.forEach { info ->
                        if (!PermissionUtils.checkAppPermission(context, info.name, pkg)) {
                            PermissionUtils.grantPermission(context, pkg, info.name)
                        }
                    }
                    listener(true, "permissions all granted! ")
                }
            } ?: listener(false, "permissions cannot be null")
        } catch (e: Exception) {
            listener(false, e.toString())
        }

    }


    private fun setOpAllow(packageName: String, opStr: String) =
        setOpMode(packageName, opStr, AppOpsManager.MODE_ALLOWED)


    /**
     * 设置某个应用权限
     * @param packageName the apk you authorization
     * @param mode like {@link OpsConstants.Ops}
     */
    private fun setOpMode(
        packageName: String,
        permission: String,
        mode: Int
    ): Boolean {
        return try {
            //检察是否已经赋予了权限
            val ops = OpsConstants.instance
            val opStr = ops.permissionToOp(permission)

            var allOk = opStr?.let {
                val op = ops.strOpToOp(it)

                val modeStr: String = when (mode) {
                    AppOpsManager.MODE_ALLOWED -> "allow"
                    AppOpsManager.MODE_ERRORED -> "deny"
                    AppOpsManager.MODE_IGNORED -> "ignore"
                    AppOpsManager.MODE_DEFAULT -> "default"
                    else -> throw IllegalArgumentException("Unexpected app op type")
                }
                val command = "appops set $packageName $it $modeStr"
                val cmdReuslt = Shell.SH.run(command)
                if (cmdReuslt.isSuccessful) {
                    true
                } else {
                    listener?.also { it(false, "setOpMode fail: ${cmdReuslt.getStderr()}") }
                    false
                }

            } ?: false

            allOk


        } catch (e: Exception) {
            listener?.also { it(false, e.toString()) }
            e.printStackTrace()
            false
        }
    }


}