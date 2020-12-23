package com.zhengsr.opshelper

import android.annotation.TargetApi
import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.PermissionInfo
import android.os.Build
import android.os.Process
import android.os.UserHandle
import java.util.ArrayList

/**
 * @author by zhengshaorui 2020/12/22 20:15
 * describe：
 */
internal object PermissionUtils {
    /**
     * 检察权限
     */
    fun checkAppPermission(
        context: Context,
        permissionName: String,
        packageName: String
    ): Boolean {
        val pm: PackageManager = context.packageManager
        return PackageManager.PERMISSION_GRANTED ==
                pm.checkPermission(permissionName, packageName)
    }


    /**
     * 通过包名和权限名授予运行时权限
     *
     * @param packageName 包名
     * @param permission  权限名
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    fun grantPermission(context: Context,packageName: String, permission: String) {
        val packageManager: PackageManager =
            context.packageManager
        val method = packageManager
            .javaClass
            .getMethod(
                "grantRuntimePermission",
                String::class.java,
                String::class.java,
                UserHandle::class.java
            )
        method.isAccessible = true
        method.invoke(packageManager, packageName, permission, Process.myUserHandle())
    }



    fun getApplicationPermission(
        context: Context,
        packageName: String,
        permissions:List<String>
    ): List<PermissionInfo>? {
        val filter = mutableListOf<String>()
        permissions.forEach {
            filter.add(it)
        }
        val permissionInfoList: MutableList<PermissionInfo> =
            ArrayList()
        val pm: PackageManager = context.packageManager
        val pi: PackageInfo
        try {
            pi = pm.getPackageInfo(packageName, PackageManager.GET_PERMISSIONS)
            val pkgPermissions = pi.requestedPermissions
            if (pkgPermissions != null) {
                for (str in pkgPermissions) {
                    if (filter.contains(str)) {
                        val permissionInfo =
                            context.packageManager.getPermissionInfo(str, 0)
                        permissionInfoList.add(permissionInfo)
                    }
                }
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return permissionInfoList
    }
}