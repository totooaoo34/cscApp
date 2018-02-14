package com.iofd.csc.action;

import java.util.ArrayList;
import java.util.List;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.iofd.csc.R;
import com.iofd.csc.adapter.ImgFragmentAdapter;
import com.iofd.csc.adapter.ListViewFragmentAdapter;
import com.iofd.csc.adapter.MenuAdapter;
import com.iofd.csc.bean.Menu;
import com.iofd.csc.custiomview.ClickableRadioGroup;
import com.iofd.csc.custiomview.ShowPageView;

public class cscMessage extends FragmentActivity {
	public static LinearLayout slideLayout;
	public static RelativeLayout back_All, main_Layout;
	LinearLayout main_menuRL;
	LinearLayout main_menuLL;
	ListView menu_back_left, menu_back_right;
	static ViewPager pager;
	private static TextView line;
	static RadioGroup group;
	public static ClickableRadioGroup scrollView;
	public static double GroupButtonWidth = 0;
	public static ViewPager ViewPager_detil;
	public static Context mContext;
	private DisplayMetrics dm;
	public static int SH;
	public static int SW;
	static Dialog builder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		isGo = true;

		dm = new DisplayMetrics();

		getWindowManager().getDefaultDisplay().getMetrics(dm);
		SH = (int) (dm.heightPixels / 2.0);
		SW = (int) (dm.widthPixels / 2.0);
		// SharedPreferences preferences = getSharedPreferences("boy",
		// Context.MODE_PRIVATE);
		// if (-1 == preferences.getInt("userInfo", -1)) {
		// }
		// builder = new Dialog(this);
		// View inflate = LayoutInflater.from(getApplication()).inflate(
		// R.layout.turn_icon, null);
		// inflate.setBackgroundResource(android.R.drawable.btn_radio);
		// builder.setContentView(inflate);
		// builder.setTitle("");
		//
		cscMessage.main_Layout = (RelativeLayout) LayoutInflater.from(
				getApplication()).inflate(R.layout.csc_message, null);
		ViewPager_detil = (ViewPager) main_Layout
				.findViewById(R.id.ViewPager_detil);
		ViewPager_detil.setAdapter(new ListViewFragmentAdapter(
				getSupportFragmentManager()));
		//
		ViewPager_detil.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				int total = (int) ((arg0 + arg1) * GroupButtonWidth);
				int green = (int) ((ViewPager_detil.getWidth() - GroupButtonWidth) / 2);// ��ȡ���а�ť��x���
				int scroll = total - green;
				scrollView.scrollTo(scroll, 0);
				tvMoveTo(arg0, arg1);
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});

		cscMessage.slideLayout = (LinearLayout) LayoutInflater.from(
				getApplication()).inflate(R.layout.app_top, null);// top飞出层
		pager = (ViewPager) slideLayout.findViewById(R.id.ViewPager);
		pager.setAdapter(new ImgFragmentAdapter(getSupportFragmentManager()));
		showPageView = (ShowPageView) slideLayout
				.findViewById(R.id.ShowPageView);
		ViewPager_detil.setY(showPageView.getHeight());
		pager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				ShowPageView.num = arg0 + 1;
				showPageView.postInvalidate();
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
		main_Layout.addView(slideLayout);
		//
		// 第二层铺底
		back_All = (RelativeLayout) LayoutInflater.from(this).inflate(
				R.layout.activity_main, null);
		main_menuRL = (LinearLayout) back_All.findViewById(R.id.ll_main_R);

		main_menuLL = (LinearLayout) back_All.findViewById(R.id.ll_main_L);

		// LayoutParams layoutParams=new
		// LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
		// layoutParams.height=1024;
		// main_Layout.setLayoutParams(layoutParams);

		// 滑盖主界面
		back_All.addView(main_Layout);
		setContentView(back_All);
		mContext = this;
		// builder.show();

		// 横向滚动条
		//
		//

		scrollView = (ClickableRadioGroup) slideLayout
				.findViewById(R.id.food_HorizontalScrollView);
		//
		group = (RadioGroup) slideLayout.findViewById(R.id.menu_RadioGroup);
		RadioButton group1 = (RadioButton) findViewById(R.id.menu_RadioGroup7);
		GroupButtonWidth = 125;
		// group.getWidth()/7.0;
		group.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				switch (arg1) {
				case R.id.menu_RadioGroup1:
					ViewPager_detil.setCurrentItem(0);
					break;
				case R.id.menu_RadioGroup2:
					ViewPager_detil.setCurrentItem(1);
					break;
				case R.id.menu_RadioGroup3:
					ViewPager_detil.setCurrentItem(2);
					break;
				case R.id.menu_RadioGroup4:
					ViewPager_detil.setCurrentItem(3);
					break;
				case R.id.menu_RadioGroup5:
					ViewPager_detil.setCurrentItem(4);
					break;
				case R.id.menu_RadioGroup6:
					ViewPager_detil.setCurrentItem(5);
					break;
				case R.id.menu_RadioGroup7:
					ViewPager_detil.setCurrentItem(6);
					break;
				default:
					ViewPager_detil.setCurrentItem(0);
					break;
				}
				// Toast.makeText(cscMessage.this, ""+index, 0).show();
			}
		});

		line = (TextView) slideLayout.findViewById(R.id.line);

		// 用户登录
		LinearLayout LoginClick = (LinearLayout) back_All
				.findViewById(R.id.LoginClick);
		LoginClick.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(cscMessage.this, LoginActivity.class));

			}
		});
		// 左右菜单
		menu_back_left = (ListView) main_menuLL
				.findViewById(R.id.main_L_listView1);

		menu_back_right = (ListView) back_All
				.findViewById(R.id.menu_right_listView1);

		// 左推拉点击

		ImageView showLeft = (ImageView) findViewById(R.id.main_center_left_ImageView);
		showLeft.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (main_Layout.getX() != SW)
					// showMenuflag = -1;
					// else
					showMenuflag = 1;
				flashMenu();
			}
		});
		// 右推拉
		ImageView showRight = (ImageView) findViewById(R.id.main_center_right_ImageView);
		showRight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				if (main_Layout.getX() != -SW)
					// showMenuflag = 1;
					// else
					showMenuflag = -1;
				flashMenu();
			}
		});
		handleShow.sendEmptyMessage(0);
		ViewPager_detil.setY(435);
	}

	public static int countOpen = 0;
	public static boolean fragmetSrcolling = false;
	Handler handle = new Handler() {
		@Override
		public void handleMessage(android.os.Message msg) {

			main_Layout.setX(countOpen);
		};
	};
	static Intent ListIntent;
	Handler handleShow = new Handler() {
		@Override
		public void handleMessage(android.os.Message msg) {
			ListIntent = new Intent(cscMessage.mContext, ListInfoActivity.class);
			List<Menu> list = new ArrayList<Menu>();
			list.add(new Menu(R.drawable.main_menu_main_png,
					getString(R.string.menu_main)));
			list.add(new Menu(R.drawable.main_menu_msg_png,
					getString(R.string.menu_msg)));
			list.add(new Menu(R.drawable.main_menu_rundio_png,
					getString(R.string.menu_rundio)));
			list.add(new Menu(R.drawable.main_menu_survey_png,
					getString(R.string.menu_survay)));
			list.add(new Menu(R.drawable.main_menu_questioin_png,
					getString(R.string.menu_question)));
			list.add(new Menu(R.drawable.main_menu_remark_png,
					getString(R.string.menu_remark)));
			list.add(new Menu(R.drawable.main_menu_about_png,
					getString(R.string.menu_about)));
			MenuAdapter adapter_listMenuLeft = new MenuAdapter(
					getApplicationContext(), list);
			menu_back_left.setAdapter(adapter_listMenuLeft);

			menu_back_left.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
					switch (arg2) {
					case 0:

						// showMenuflag = 1;
						flashMenu();
						break;
					case 1:// 消息中心
						ListIntent.putExtra("tag", 20);
						ListIntent.putExtra("bg", R.drawable.xiaoxi);
						startActivity(ListIntent);
						break;
					case 2://
						// ListIntent.putExtra("tag", 30);
						// ListIntent.putExtra("bg", R.drawable.xiaoxi);
						// startActivity(ListIntent);
						break;
					case 3://
						ListIntent.putExtra("tag", 30);
						ListIntent.putExtra("bg", R.drawable.ceping);
						startActivity(ListIntent);
						break;
					case 4:// 常见问题
						ListIntent.putExtra("tag", 40);
						ListIntent.putExtra("bg", R.drawable.canjian);
						startActivity(ListIntent);
						break;
					case 5:// 使用反馈
						ListIntent.putExtra("tag", 50);
						ListIntent.putExtra("bg", R.drawable.fankui);
						startActivity(ListIntent);
						break;
					case 6:// 关于软件
						// ListIntent.putExtra("tag", 60);
						// ListIntent.putExtra("bg", R.drawable.);
						// startActivity(ListIntent);
						break;
					default:
						break;
					}
				}
			});
			List<Menu> list2 = new ArrayList<Menu>();
			list2.add(new Menu(R.drawable.main_menu_main_png,
					getString(R.string.menu_main)));
			list2.add(new Menu(R.drawable.main_menu_someinfo_png,
					getString(R.string.menu_someinfo)));
			list2.add(new Menu(R.drawable.main_menu_myorder_png,
					getString(R.string.menu_myorder)));
			list2.add(new Menu(R.drawable.main_menu_sendaddr_png,
					getString(R.string.menu_sendaddr)));
			list2.add(new Menu(R.drawable.main_menu_myorder_png,
					getString(R.string.menu_elet)));
			list2.add(new Menu(R.drawable.main_menu_popu_png,
					getString(R.string.menu_popu)));
			MenuAdapter adapter_listMenuRight = new MenuAdapter(
					getApplicationContext(), list2);

			menu_back_right.setAdapter(adapter_listMenuRight);
			menu_back_right.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
					switch (arg2) {
					case 0:

						// showMenuflag =- 1;
						flashMenu();
						break;
					case 3:// 购物车
						ListIntent.putExtra("tag", 11);
						// ListIntent.putExtra("bg", R.drawable.xiaoxi);
						startActivity(ListIntent);
						break;
					case 1:
						// ListIntent.putExtra("tag", 21);
						// ListIntent.putExtra("bg", R.drawable.xiaoxi);
						// startActivity(ListIntent);
						break;
					case 2:// 我的订单
						ListIntent.putExtra("tag", 0);
//						 ListIntent.putExtra("bg", R.drawable.xiaoxi);
						startActivity(ListIntent);
						break;
					case 4:// 送餐地址
						// ListIntent.putExtra("tag", 41);
						// ListIntent.putExtra("bg", R.drawable.xiaoxi);
						// startActivity(ListIntent);
						break;
					case 5:// 电子券
						// ListIntent.putExtra("tag", 51);
						// ListIntent.putExtra("bg", R.drawable.xiaoxi);
						// startActivity(ListIntent);
						break;
					case 6:// 推广
						ListIntent.putExtra("tag", 61);
						ListIntent.putExtra("bg", R.drawable.tip);
						startActivity(ListIntent);
						break;
					default:
						break;
					}
				}
			});//

			// builder.dismiss();
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (isGo) {
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						showPageView.num += 1;
						if (showPageView.num > 3)
							showPageView.num = 1;
						handler.sendEmptyMessage(0);
						handler.sendEmptyMessage(0);
					}
				}
			}).start();

		};
	};
	public static ShowPageView showPageView;

	public static int showMenuflag = 1;

	// 菜单飞出特效
	private void flashMenu() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					countOpen += showMenuflag;
					if (countOpen >= SW || countOpen <= -SW || countOpen == 0) {
						showMenuflag = -showMenuflag;
						return;
					} else {

						if (countOpen < -SW || countOpen > SW)
							SW = 0;
						handle.sendEmptyMessage(0);
						try {
							Thread.sleep(1);
						} catch (Exception e) {
						}
					}
				}
			}
		}).start();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		isGo = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (isGo) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					showPageView.num += 1;
					if (showPageView.num > 3)
						showPageView.num = 1;
					handler.sendEmptyMessage(0);
					com.iofd.csc.action.cscMessage.handler.sendEmptyMessage(0);
				}
			}
		}).start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		isGo = false;
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
		super.onPause();
	}

	public static Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			if (isGo)
				pager.setCurrentItem(ShowPageView.num - 1);
		}
	};
	public static boolean isGo = true;

	public static Handler handlerSuperShow = new Handler() {
		public void handleMessage(android.os.Message msg) {

			switch (msg.what) {
			case 0:
				main_Layout.setY(-400);
				break;
			default:
				main_Layout.setY(0);
				break;
			}
		};

	};

	public static void tvMoveTo(int index, float f) {
		// TODO Auto-generated method stub
		float location = (float) (GroupButtonWidth * (index + f));
		TranslateAnimation animation = new TranslateAnimation(fromX, location,
				0, 0);
		animation.setDuration(50);
		animation.setFillAfter(true);
		fromX = location;
		line.startAnimation(animation);
	}

	static float fromX = 0;
	public static Handler animationHandler2 = new Handler() {
		public void handleMessage(android.os.Message msg) {
			View view=(View) msg.obj;
			ScaleAnimation animation = new ScaleAnimation(0, 0, 2, 2);
			animation.setDuration(500);
			animation.setFillAfter(true);
			view.startAnimation(animation);
		};
	};
}
