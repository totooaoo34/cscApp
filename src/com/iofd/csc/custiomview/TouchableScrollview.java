package com.iofd.csc.custiomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class TouchableScrollview extends ScrollView {

	public TouchableScrollview(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
	
		 if (super.onInterceptTouchEvent(ev))
		 return !moveAble;
		 else
		 return false;
//		 return super.onInterceptTouchEvent(ev);
	}

	public static boolean moveAble = true;
}
