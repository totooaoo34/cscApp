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

public class FoodDetilFragment2 extends FoodDetilFragment {

	@Override
	void setData() {
		// TODO Auto-generated method stub
		mlist = new ArrayList<Foods>();
		mlist.add(new Foods("�����ȷ�", "", "18.5", "4088", "0"));
		mlist.get(0).pic = R.drawable.jp;
		mlist.add(new Foods("��������ţ�Ƿ�", "", "25.0", "2956", "0"));
		mlist.get(1).pic = R.drawable.hei_jiao;
		mlist.add(new Foods("��������", "", "6.5", "2258", "0"));
		mlist.get(2).pic = R.drawable.food1;
		mlist.add(new Foods("�㱬С���ⷹ", "", "14.5", "2148", "0"));
		mlist.get(3).pic = R.drawable.unkown;
		mlist.add(new Foods("�������᷹", "", "22.0", "2067", "0"));
		mlist.get(4).pic = R.drawable.jp;
		mlist.add(new Foods("ʨ��ͷ˫ƴ", "", "16.0", "2010", "0"));
		mlist.get(5).pic = R.drawable.jsp;
		mlist.add(new Foods("�㹽����", "", "14.0", "1956", "0"));
		mlist.get(6).pic = R.drawable.xgdj;
		mlist.add(new Foods("�ݽ�ţ��˿��", "", "16.5", "1940", "0"));
		mlist.get(7).pic = R.drawable.jbys;
		mlist.add(new Foods("�㱬С����˫ƴ", "", "16.0", "1883", "0"));
		mlist.get(8).pic = R.drawable.rsp;
		mlist.add(new Foods("̨ʽ±��˫ƴ", "", "16.0", "1959", "0"));
		mlist.get(9).pic = R.drawable.taishi;

	}
}
