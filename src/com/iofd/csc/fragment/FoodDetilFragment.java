package com.iofd.csc.fragment;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

import com.iofd.csc.action.cscMessage;
import com.iofd.csc.action.cscMessage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.iofd.csc.R;
import com.iofd.csc.adapter.FoodAdapter;
import com.iofd.csc.bean.Foods;

public class FoodDetilFragment extends Fragment {
	public ListView tasteListView;
	public List<Foods> mlist;
	public static boolean isClick = false;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		tasteListView = (ListView) LayoutInflater.from(getActivity()).inflate(
				R.layout.simple_list_view, null);

		setData();
		setTouch();
		return tasteListView;
	}

	void setData() {
		mlist = new ArrayList<Foods>();
		mlist.add(new Foods("◊¶Õ€øß‡¨º¶≈≈", "", "22.0", "30", "0"));
		mlist.get(0).pic = R.drawable.banner0;
		mlist.add(new Foods("Ã∆—Óº¶øÈª∂¿÷∂˘ÕØÃ◊≤Õ", "", "17.0", "46", "0"));
		mlist.get(1).pic = R.drawable.food1;
		mlist.add(new Foods("Ã∆—Óº¶øÈ", "", "8.0", "42", "0"));
		mlist.get(2).pic = R.drawable.tanyang;
		mlist.add(new Foods("…Ò≈©º‹€Á€Á»‚£®Ã◊≤Õ£©", "", "18.0", "51", "0"));
		mlist.get(3).pic = R.drawable.banner2;
		mlist.add(new Foods("…Ò≈©º‹€Á€Á»‚£®µ•∆∑£©", "", "12.0", "34", "0"));
		mlist.get(4).pic = R.drawable.banner2;
		mlist.add(new Foods("Ã˙∞Â∫⁄Ω∑º¶≈≈∑π", "", "22.0", "46", "0"));
		mlist.get(5).pic = R.drawable.hei_jiao;
	}

	void setTouch() {
		FoodAdapter adapter = new FoodAdapter(mlist, getActivity());
		// tasteListView.setOnItemClickListener(new OnItemClickListener() {
		//
		// @Override
		// public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
		// long arg3) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
		tasteListView.setAdapter(adapter);

		tasteListView.setOnTouchListener(new OnTouchListener() {

			float StartY = 0;

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				// super.onTouch();
//				slidIn(arg1);
				// Message message = new Message();

				// if (arg1.getAction() == MotionEvent.ACTION_DOWN)
				// StartY = arg1.getRawY();

				// –°æ‡¿Î¿πΩÿ
				// if (!(arg1.getRawY() > StartY - 50 && arg1.getRawY() <
				// StartY + 50))
				// // ∑¿ª¨≥ˆ if (cscMessage.ViewPager_detil.getY() > 0)
				// if (!(com.iofd.csc.action.cscMessage.slideLayout.getY() >
				// 0)) {
				// // com.iofd.csc.action.cscMessage.slideLayout.setY(arg1.
				// // getRawY() - StartY);
				// // com.iofd.csc.action.cscMessage.ViewPager_detil
				// // .setY(arg1.getRawY()
				// // - StartY
				// // + com.iofd.csc.action.cscMessage.slideLayout
				// // .getHeight());
				// }
				if (arg1.getAction() == MotionEvent.ACTION_UP) {

					// –°æ‡¿Î¿πΩÿ
					{
						if ((StartY < arg1.getRawY() + 20 && StartY > arg1
								.getRawY() - 20))
							isClick = true;
						else
							isClick = false;
						if (com.iofd.csc.action.cscMessage.ViewPager_detil
								.getY() > 90) {
							// message.what = 0;
							// message.obj=
							com.iofd.csc.action.cscMessage.ViewPager_detil
									.setY(70
									// -340 +
									// com.iofd.csc.action.cscMessage.slideLayout.getHeight()
									);
							com.iofd.csc.action.cscMessage.slideLayout
									.setY(-360);
						} else {
							com.iofd.csc.action.cscMessage.slideLayout.setY(0);
							com.iofd.csc.action.cscMessage.ViewPager_detil
									.setY(com.iofd.csc.action.cscMessage.slideLayout
											.getHeight());

							// message.what = 1;
						}
					}
				}
				return isClick;
			}
		});

	}

//	void slidIn(MotionEvent event) {
//		// TODO Auto-generated method stub
//
//		fillingNum = event.getRawX();
//		switch (event.getAction()) {
//		case MotionEvent.ACTION_DOWN:
//			startX = fillingNum - cscMessage.main_Layout.getX();
//			break;
//		case MotionEvent.ACTION_UP:
//
//			// if (cscMessage.ViewPager_detil.getCurrentItem() == 0
//			// || cscMessage.ViewPager_detil.getCurrentItem() ==
//			// cscMessage.ViewPager_detil
//			// .getChildCount())
//			// –°æ‡¿Î¿πΩÿ
////
////			if (fillingNum < cscMessage.SW * 2.0 / 3.0) {
////				cscMessage.main_Layout.setX(-cscMessage.SW);
////			} else if (fillingNum > cscMessage.SW * 2.0 / 3.0 * 2) {
////				cscMessage.main_Layout.setX(cscMessage.SW);
////
////			} else {
////				cscMessage.main_Layout.setX(0);
////			}
////			break;
//		default:
//			// –°æ‡¿Î¿πΩÿ
//			if ((cscMessage.main_Layout.getX() < cscMessage.SW)
//					&& (cscMessage.main_Layout.getX()
//							+ cscMessage.main_Layout.getWidth() > cscMessage.SW))
//
//				if (!(startX - event.getRawX() < 30 && event.getRawX() - startX < 30))
//					cscMessage.main_Layout.setX(fillingNum - startX);
//		}
//
//	}
//
//	float fillingNum = 0, startX = 0;
}
// tasteListView = (ListView) main_Layout
// .findViewById(R.id.listView_taste);
// ArrayAdapter<String> adapter = new ArrayAdapter<String>(
// getActivity(), android.R.layout.simple_list_item_1);
// adapter.add("a");
// adapter.add("a");
// adapter.