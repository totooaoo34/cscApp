package com.iofd.csc.fragment;

import com.iofd.csc.R;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

@SuppressLint("ValidFragment")
public class BannerFragment3 extends BannerFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		ImageView view = new ImageView(getActivity());
		view.setBackgroundResource(R.drawable.banner1);
		return view;
	}
}
