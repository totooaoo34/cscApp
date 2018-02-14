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

public class FoodDetilFragment5 extends FoodDetilFragment {

	@Override
	void setData() {
		// TODO Auto-generated method stub
		mlist = new ArrayList<Foods>();
		mlist.add(new Foods("´óÅÆÕÕÉÕ¼¦°Ç", "", "25.0", "16", ""));
		mlist.add(new Foods("×¦ÍÛ¿§à¬¼¦ÅÅ", "", "22.0", "30", "0"));
		mlist.add(new Foods("ÌÆÑî¼¦¿é»¶ÀÖ¶ùÍ¯Ì×²Í", "", "17.0", "46", "0"));
		mlist.add(new Foods("Ìú°åºÚ½·¼¦ÅÅ·¹", "", "22.0", "46", "0"));
		mlist.add(new Foods("°ÄÖŞÌú°åÅ£°Ç·¹", "", "25.0", "2956", "0"));
		mlist.add(new Foods("ÃÛÀ±¿¾³á·¹", "", "22.0", "2067", "0"));
		mlist.add(new Foods("¹¦·ò¼¦ÍÈ·¹", "", "18.5", "4088", "0"));

	}

}
