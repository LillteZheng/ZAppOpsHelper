# ZAppOpsHelper
 静默权限设置
 
## 关联

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

```
implementation 'com.github.LillteZheng:ZAppOpsHelper:v1.0.0'
//命令行，需要关联，库用到
implementation 'com.jaredrummler:android-shell:1.0.0'
```
 
 使用如下：
 
 ```
 /**
	* 保证你的应用有系统权限
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
