package com.zhengsr.appopshelper

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zhengsr.opshelper.ZAppOpsHelper

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * 保证你的应用有系统权限
         * 然后让你的 build.gradle com.jaredrummler:android-shell:1.0.0
         */
        ZAppOpsHelper.with(this)
            .packageName("com.launcher.test")
            .permissions(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.SYSTEM_ALERT_WINDOW //8.0必须是系统应用，这个可以赋值，但是还是会崩溃

            )
            .request{ result,msg->
                Log.d(TAG, "zsr onCreate: ")

            }
    }
}