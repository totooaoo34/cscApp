package com.iofd.csc.action;

import java.util.ArrayList;
import java.util.List;

import com.iofd.csc.R;
import com.iofd.csc.R.id;
import com.iofd.csc.R.layout;
import com.iofd.csc.adapter.FoodAdapter;
import com.iofd.csc.adapter.MenuAdapter;
import com.iofd.csc.bean.Foods;
import com.iofd.csc.bean.Menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import application.CscApp;

public class ListInfoActivity extends Activity {

	int bg = 0;
	int key=-1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		List<Menu> list = new ArrayList<Menu>();

		View view = LayoutInflater.from(getApplication()).inflate(
				R.layout.activity_list_info, null);

		ListView findViewById = (ListView)view. findViewById(R.id.simple_listView1);
		Intent intent = getIntent();
		if (null != intent) {
			key = intent.getIntExtra("tag", 0);

			bg = intent.getIntExtra("bg", 0);
			if (0 != bg)
				switch (key) {
				// case 11:
				//
				// break;
				// case 12:
				//
				// break;
				// case 13:
				//
				// break;
				// case 14:
				//
				// break;
				// case 15:
				//
				// break;
				//
				// case 10:
				//
				// break;
				// case 20:
				//
				// break;
				// case 30:
				//
				// break;
				// case 40:
				//
				// break;
				// case 50:
				// break;
				default:
					Menu menu = new Menu(R.drawable.main_menu_main_png,
							getString(R.string.menu_main));
					list.add(menu);
					break;
				}
		}
		setContentView(view);
		if (0 == key){
			view.setBackgroundDrawable(null);
			findViewById.setAdapter(new FoodAdapter(CscApp.buyCar, this));
		}else
			view.setBackgroundResource(bg);
	}
}
