package org.itheima.mobilesafe.activity;

import org.itheima.mobilesafe.R;
import org.itheima.mobilesafe.utils.PackageUtils;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends Activity {
	private TextView mTvVersion;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		mTvVersion = (TextView) findViewById(R.id.splash_tv_version);
		mTvVersion.setText("版本号：" + PackageUtils.getVersionName(this));

	}
}
