package com.iofd.csc.fragment;

import java.util.ArrayList;
import java.util.List;

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

public class FoodDetilFragment6 extends FoodDetilFragment {

	@Override
	void setData() {
		// TODO Auto-generated method stub
		mlist = new ArrayList<Foods>();
		mlist.add(new Foods("�����", "", "8.0", "42", "0"));
		mlist.add(new Foods("�⽴����", "", "8.0", "43", ""));
		mlist.add(new Foods("�嵰", "", "1.5", "1171", ""));
		mlist.add(new Foods("±��", "", "1.5", "1256", ""));
		mlist.add(new Foods("��������", "", "6.5", "2258", ""));
	}

}
