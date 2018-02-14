package com.iofd.csc.custiomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.iofd.csc.action.cscMessage;

public class ShowPageView extends View {

	int Width;
	int Height;
	private float centerX;
	private float centerY;
	public static int num = 1;
	Paint paint;
	final int pointWight = 20;

	public ShowPageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		paint = new Paint();
	
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Width = this.getWidth();
		Height = this.getHeight();
		centerX = (float) (Width / 2.0);
		centerY = (float) (Height / 2.0);
		paint.setStrokeWidth(10);
		if (1 == num) {
			paint.setColor(Color.BLUE);
		} else {
			paint.setColor(Color.BLACK);
		}
		canvas.drawCircle(centerX - pointWight , centerY, pointWight / 2,
				paint);
		if (2 == num)
			paint.setColor(Color.BLUE);
		else
			paint.setColor(Color.BLACK);
		canvas.drawCircle(centerX, centerY, pointWight / 2, paint);
		if (3 == num)
			paint.setColor(Color.BLUE);
		else
			paint.setColor(Color.BLACK);
		canvas.drawCircle(centerX + pointWight , centerY, pointWight / 2,
				paint);

	}

	Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			invalidate();
		};
	};
}
