package com.iofd.csc.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.iofd.csc.fragment.BannerFragment;
import com.iofd.csc.fragment.BannerFragment2;
import com.iofd.csc.fragment.BannerFragment3;

public class ImgFragmentAdapter extends FragmentPagerAdapter {
	BannerFragment[] objs;

	public ImgFragmentAdapter(FragmentManager fm) {
		super(fm);
		objs = new BannerFragment[3];
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		if (null == objs[arg0])
			switch (arg0) {
			case 1:
				objs[arg0] = new BannerFragment();
				break;
			case 2:
				objs[arg0] = new BannerFragment3();
				break;

			default:
				objs[arg0] = new BannerFragment2();
				break;
			}
		return objs[arg0];
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return objs.length;
	}

}
