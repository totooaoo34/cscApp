package com.iofd.csc.adapter;

import java.util.List;

import com.iofd.csc.R;
import com.iofd.csc.bean.Questoin_Demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Question_Adapter extends BaseAdapter {
	Context mContext;
	List<Questoin_Demo> mList;

	public Question_Adapter(Context mContext, List<Questoin_Demo> mList) {
		super();
		this.mContext = mContext;
		this.mList = mList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return LayoutInflater.from(mContext).inflate(R.layout.activity_ask, null);
	}

}
