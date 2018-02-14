package com.iofd.csc.fragment;

import java.util.ArrayList;
import java.util.List;

import com.iofd.csc.R;
import com.iofd.csc.adapter.FoodAdapter;
import com.iofd.csc.bean.Foods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;

public class FoodDetilFragment4 extends FoodDetilFragment {

	@Override
	void setData() {
		// TODO Auto-generated method stub
		mlist = new ArrayList<Foods>();
		mlist.add(new Foods("ÉñÅ©¼ÜÛçÛçÈâ£¨Ì×²Í£©", "", "18.0", "51", "0"));
		mlist.get(0).pic = R.drawable.banner2;
		mlist.add(new Foods("ÉñÅ©¼ÜÛçÛçÈâ£¨µ¥Æ·£©", "", "12.0", "34", "0"));
		mlist.get(1).pic = R.drawable.banner2;
		mlist.add(new Foods("Ì¨Ê½Â±ÈâË«Æ´", "", "16.0", "1959", "0"));
		mlist.get(2).pic = R.drawable.taishi;
		mlist.add(new Foods("Åİ½·Å£ÈâË¿Ë«Æ´", "", "17.0", "1708", "0"));
		mlist.get(3).pic = R.drawable.rsp;
		mlist.add(new Foods("Ê¨×ÓÍ·Ë«Æ´", "", "16.0", "2010", "0"));
		mlist.get(4).pic = R.drawable.jsp;
		mlist.add(new Foods("Ïã¹½¼¦·¹", "", "14.0", "1956", "0"));
		mlist.get(5).pic = R.drawable.xgdj;
		mlist.add(new Foods("Ã·²Ë¿ÛÈâË«Æ´", "", "16.0", "1854", "0"));
		mlist.get(6).pic = R.drawable.suanping;
		mlist.add(new Foods("Ïã±¬Ğ¡³´ÈâË«Æ´", "", "16.0", "1883", "0"));
		mlist.get(7).pic = R.drawable.unkown;
		mlist.add(new Foods("Ïã¹½Ë«Æ´", "", "15.0", "1574", "0"));
		mlist.get(8).pic = R.drawable.jbys;
		mlist.add(new Foods("°×·¹", "", "2.0", "459", "0"));
		mlist.get(9).pic = 0;
		mlist.add(new Foods("Å¨ÌÀ", "", "1.0", "", ""));
		mlist.get(10).pic = 0;
		mlist.add(new Foods("Ïã±¬Ğ¡³´Èâ·¹", "", "14.5", "2148", "0"));
		mlist.get(11).pic = R.drawable.rsp;
		mlist.add(new Foods("½ª±¬Ñ¼Ë¿·¹", "", "14.5", "1745", ""));
		mlist.get(12).pic = R.drawable.suanping;
		mlist.add(new Foods("Åİ½·Å£ÈâË¿·¹", "", "16.5", "1940", "0"));
		mlist.get(13).pic = R.drawable.unkown;
		mlist.add(new Foods("Åİ½·Å£ÈâË¿·¹", "", "16.5", "1940", "0"));
		mlist.get(14).pic = R.drawable.jbys;
		mlist.add(new Foods("Ïã¹½¼¦·¹", "", "14.0", "1956", "0"));
		mlist.get(15).pic = R.drawable.xgdj;
	}

}
