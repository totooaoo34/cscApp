package com.iofd.csc.custiomview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class ClickableRadioGroup extends HorizontalScrollView {

	public ClickableRadioGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
//
//	@Override
//	public boolean onInterceptTouchEvent(MotionEvent ev) {
//		// TODO Auto-generated method stub
//		if (clickAble)
//		return super.onInterceptTouchEvent(ev);
//		return false;
//	}
	public static boolean clickAble=false;
	
}
