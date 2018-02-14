package com.iofd.csc.action;

import com.iofd.csc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SplashActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		RelativeLayout linearLayout = (RelativeLayout) findViewById(R.id.bg_see_imageView);
		RelativeLayout linearLayout2 = (RelativeLayout) findViewById(R.id.bg_unsee_imageView);
		linearLayout.setBackgroundResource(R.drawable.loading_bg);
		linearLayout2.setBackgroundResource(R.drawable.loading_bg);
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				startActivity(new Intent(SplashActivity.this, cscMessage.class));
				finish();
			}
		}).start();
	}
}
