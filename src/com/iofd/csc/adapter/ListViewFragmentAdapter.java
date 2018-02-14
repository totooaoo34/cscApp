package com.iofd.csc.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.iofd.csc.action.cscMessage;
import com.iofd.csc.fragment.FoodDetilFragment;
import com.iofd.csc.fragment.FoodDetilFragment2;
import com.iofd.csc.fragment.FoodDetilFragment3;
import com.iofd.csc.fragment.FoodDetilFragment4;
import com.iofd.csc.fragment.FoodDetilFragment5;
import com.iofd.csc.fragment.FoodDetilFragment6;
import com.iofd.csc.fragment.FoodDetilFragment7;

public class ListViewFragmentAdapter extends FragmentPagerAdapter {
	FoodDetilFragment[] objs;

	public ListViewFragmentAdapter(FragmentManager fm) {
		super(fm);
		objs = new FoodDetilFragment[7];
		// TODO Auto-generated constructor stub
	}

	FoodDetilFragment arg1 = null;

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		arg1 = objs[arg0];
		if (null == objs[arg0]) {
			switch (arg0) {
			case 1:
				objs[arg0] = new FoodDetilFragment2();
				break;
			case 2:
				objs[arg0] = new FoodDetilFragment3();
				break;
			case 3:
				objs[arg0] = new FoodDetilFragment4();
				break;
			case 4:
				objs[arg0] = new FoodDetilFragment5();
				break;

			case 5:
				objs[arg0] = new FoodDetilFragment6();
				break;

			case 6:
				objs[arg0] = new FoodDetilFragment7();
				break;

			default:
				objs[arg0] = new FoodDetilFragment();
				break;
			}
			
			
		}
		return objs[arg0];
		// BannerFragment();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return objs.length;
	}
}
