package org.itheima.mobilesafe.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class PackageUtils {
	/**
	 * 获取当前版本名称
	 * @param context 上下文
	 * @return
	 */
	public static String getVersionName(Context context) {
		PackageManager Pm = context.getPackageManager();
		try {
			PackageInfo info = Pm.getPackageInfo(context.getPackageName(), 0);
			return info.versionName;
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
/**
 * 获取当前版本号
 * @param context 上下文
 * @return
 */
	public static int getVersionCode(Context context) {
		PackageManager Pm = context.getPackageManager();
		try {
			PackageInfo info = Pm.getPackageInfo(context.getPackageName(), 0);
			return info.versionCode;
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
}
