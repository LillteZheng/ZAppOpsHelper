package com.zhengsr.opshelper

import android.content.Context

/**
 * @author by zhengshaorui 2020/12/14 10:10
 * describe：权限赋予工具类，请注意您的app持有系统签名
 */



object ZAppOpsHelper {
    fun with(context: Context) = OpCollection(context)
}

class OpCollection(private val context: Context){
    fun packageName(pkg:String) = OpsRequest(context.applicationContext,pkg)
}