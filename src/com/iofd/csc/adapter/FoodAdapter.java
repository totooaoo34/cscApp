package com.iofd.csc.adapter;

import java.util.List;

import com.iofd.csc.R;
import com.iofd.csc.action.ListInfoActivity;
import com.iofd.csc.action.cscMessage;
import com.iofd.csc.bean.Foods;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import application.CscApp;

public class FoodAdapter extends BaseAdapter implements OnClickListener {
	List<Foods> _mList;
	Context _mContext;

	public FoodAdapter(List<Foods> _mList, Context _mContext) {
		super();
		this._mList = _mList;
		this._mContext = _mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return _mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return _mList.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	ViewHolder viewHolder = null;

	Builder builder;

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub

		food = _mList.get(arg0);
		if (arg1 == null) {

			viewHolder = new ViewHolder();
			viewHolder.food = food;
			arg1 = LayoutInflater.from(_mContext).inflate(R.layout.li_food,
					null);
			viewHolder.textView_name = (TextView) arg1
					.findViewById(R.id.li_food_named_textView1);
			viewHolder.price = (TextView) arg1
					.findViewById(R.id.li_food_price_textView1);
			viewHolder.good = (TextView) arg1
					.findViewById(R.id.li_food_good_textView);
			viewHolder.good.setTag(viewHolder);
			viewHolder.good.setOnClickListener(new OnClickListener() {
				boolean b = true;

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					ViewHolder holder = (ViewHolder) arg0.getTag();
					int i = Integer.parseInt((holder.good.getText().toString()));
					if (b) {
						holder.good.setText("" + (i + 1));
						b = false;
					} else {
						holder.good.setText("" + (i -1));
						b = true;
					}
				}
			});
			viewHolder.goods_img = (ImageView) arg1
					.findViewById(R.id.li_food__imageView1);
			viewHolder.buy = (Button) arg1.findViewById(R.id.li_food_buyClick);
			viewHolder.numDes = (Button) arg1.findViewById(R.id.li_food_buyDes);

			viewHolder.numDes.setTag(viewHolder);
			viewHolder.numDes.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					ViewHolder holder = (ViewHolder) arg0.getTag();
					Foods foods = holder.food;
					int i = Integer.parseInt((holder.num.getText().toString()));
					try {
						if (i - 1 > 0) {
							CscApp.buyCar.remove(CscApp.buyCar
									.get(CscApp.buyCar.size() - 1));
							holder.num.setText("" + (i - 1));
						}
					} catch (Exception e) {

					}

				}
			});
			viewHolder.numAdd = (Button) arg1.findViewById(R.id.li_food_buyIns);

			viewHolder.numAdd.setTag(viewHolder);
			viewHolder.numAdd.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					ViewHolder holder = (ViewHolder) arg0.getTag();
					Foods foods = holder.food;
					CscApp.buyCar.add(foods);
					holder.num.setText(""
							+ (Integer.parseInt((holder.num.getText()
									.toString())) + 1));
				}
			});
			viewHolder.num = (TextView) arg1.findViewById(R.id.li_food_buyNum);
			arg1.setTag(viewHolder);
			viewHolder.buy.setTag(viewHolder);
			viewHolder.buy.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					ViewHolder holder = (ViewHolder) arg0.getTag();
					Foods foods = holder.food;
					CscApp.buyCar.add(foods);
					holder.num.setVisibility(View.VISIBLE);
					holder.numAdd.setVisibility(View.VISIBLE);
					holder.numDes.setVisibility(View.VISIBLE);
					Message msg = new Message();
					msg.what = 0;
					msg.obj = arg0;
					cscMessage.animationHandler2.sendMessage(msg);
				}
			});
			arg1.setOnClickListener(this);

		} else {
			viewHolder = (ViewHolder) arg1.getTag();
		}
		viewHolder.food = food;
		if ((null != food.name) && (viewHolder.textView_name != null))
			viewHolder.textView_name.setText(food.name);
		if ((null != viewHolder.price) && (food.price != null))
			viewHolder.price.setText(food.price);
		if ((null != viewHolder.good) && (food.say != null))
			viewHolder.good.setText(food.say);
		if ((null != viewHolder.goods_img) && (food.pic != 0))
			viewHolder.goods_img.setBackgroundResource(food.pic);

		return arg1;
	}

	Foods food;
	static Bitmap drawable = null;

	class ViewHolder {
		public ImageView goods_img;
		public TextView textView_name;
		public TextView price;
		public TextView good;
		public TextView num;
		public Button numAdd, numDes, buy;
		public Foods food;
	}

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder2 = (ViewHolder) arg0.getTag();
		drawable = BitmapFactory.decodeResource(_mContext.getResources(),
				viewHolder2.food.pic);
		builder = new Builder(_mContext);
		builder.setTitle("‘§¿¿");
		ImageView view = new ImageView(_mContext);

		view.setImageBitmap(drawable);
		builder.setView(view);
		// if(builder.)
		builder.show();
	}
}
