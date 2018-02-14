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
		mlist.add(new Foods("��ũ�������⣨�ײͣ�", "", "18.0", "51", "0"));
		mlist.get(0).pic = R.drawable.banner2;
		mlist.add(new Foods("��ũ�������⣨��Ʒ��", "", "12.0", "34", "0"));
		mlist.get(1).pic = R.drawable.banner2;
		mlist.add(new Foods("̨ʽ±��˫ƴ", "", "16.0", "1959", "0"));
		mlist.get(2).pic = R.drawable.taishi;
		mlist.add(new Foods("�ݽ�ţ��˿˫ƴ", "", "17.0", "1708", "0"));
		mlist.get(3).pic = R.drawable.rsp;
		mlist.add(new Foods("ʨ��ͷ˫ƴ", "", "16.0", "2010", "0"));
		mlist.get(4).pic = R.drawable.jsp;
		mlist.add(new Foods("�㹽����", "", "14.0", "1956", "0"));
		mlist.get(5).pic = R.drawable.xgdj;
		mlist.add(new Foods("÷�˿���˫ƴ", "", "16.0", "1854", "0"));
		mlist.get(6).pic = R.drawable.suanping;
		mlist.add(new Foods("�㱬С����˫ƴ", "", "16.0", "1883", "0"));
		mlist.get(7).pic = R.drawable.unkown;
		mlist.add(new Foods("�㹽˫ƴ", "", "15.0", "1574", "0"));
		mlist.get(8).pic = R.drawable.jbys;
		mlist.add(new Foods("�׷�", "", "2.0", "459", "0"));
		mlist.get(9).pic = 0;
		mlist.add(new Foods("Ũ��", "", "1.0", "", ""));
		mlist.get(10).pic = 0;
		mlist.add(new Foods("�㱬С���ⷹ", "", "14.5", "2148", "0"));
		mlist.get(11).pic = R.drawable.rsp;
		mlist.add(new Foods("����Ѽ˿��", "", "14.5", "1745", ""));
		mlist.get(12).pic = R.drawable.suanping;
		mlist.add(new Foods("�ݽ�ţ��˿��", "", "16.5", "1940", "0"));
		mlist.get(13).pic = R.drawable.unkown;
		mlist.add(new Foods("�ݽ�ţ��˿��", "", "16.5", "1940", "0"));
		mlist.get(14).pic = R.drawable.jbys;
		mlist.add(new Foods("�㹽����", "", "14.0", "1956", "0"));
		mlist.get(15).pic = R.drawable.xgdj;
	}

}
