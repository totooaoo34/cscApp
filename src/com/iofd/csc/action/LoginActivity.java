package com.iofd.csc.action;

import com.iofd.csc.R;
import com.iofd.csc.R.layout;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	public void saveLogin(View v) {
		SharedPreferences preferences = getSharedPreferences("boy",
				Context.MODE_PRIVATE);

		 Editor editor = preferences.edit();

		 editor.putInt("userInfo", 1);
		 editor.putString("name","b");
		 editor.putString("pwd","a");
		 editor.apply();
		 int int1 = preferences.getInt("a", 0);
	}
}
