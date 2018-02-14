package com.iofd.csc.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.iofd.csc.R;
import com.iofd.csc.bean.Menu;

public class MenuAdapter extends BaseAdapter {
	List<Menu> _mList;
	Context _mContext;

	public MenuAdapter(Context _mContext, List<Menu> list) {
		super();
		this._mContext = _mContext;
		_mList = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return _mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return _mList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	Menu menu;

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		menu = _mList.get(arg0);
		if (null == arg1)
			arg1 = LayoutInflater.from(_mContext).inflate(R.layout.li_menu,
					null);
		ImageView imageView = ((ImageView) arg1
				.findViewById(R.id.menu_imageView1));
		imageView.setImageBitmap(BitmapFactory.decodeResource(_mContext.getResources(), menu.icon));
		;
		TextView textView = ((TextView) arg1.findViewById(R.id.menu_textView1));
		textView.setText(menu.name);
		return arg1;

	}

	
}
