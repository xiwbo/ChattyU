package com.xiwbo.chattyu;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

	private static final int SPLASH_SCREEN_TIME = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				// new Activity (LOGIN & SIGN UP) using intent.
			}
		}, SPLASH_SCREEN_TIME);
	}
}
