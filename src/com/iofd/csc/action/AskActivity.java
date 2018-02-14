package com.iofd.csc.action;

import java.util.ArrayList;
import java.util.List;

import com.iofd.csc.R;
import com.iofd.csc.R.id;
import com.iofd.csc.R.layout;
import com.iofd.csc.adapter.Question_Adapter;
import com.iofd.csc.bean.Questoin_Demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class AskActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ask);
		ListView listView=(ListView) findViewById(R.id.question_ListView);
		List<Questoin_Demo> mList=new ArrayList<Questoin_Demo>();
		mList.add(new Questoin_Demo("",""));
		mList.add(new Questoin_Demo("",""));
		mList.add(new Questoin_Demo("",""));
		mList.add(new Questoin_Demo("",""));
		mList.add(new Questoin_Demo("",""));
		listView.setAdapter(new Question_Adapter(getApplicationContext(), mList));
	}
}
