# ZAppOpsHelper
 静默权限设置
 
 代码如下:
 
 
 ```
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
 ```
