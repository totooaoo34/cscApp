package com.iofd.csc.http;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class VolleyApplication extends Application{
	private static  VolleyApplication instance;

	private RequestQueue mQueue;//放在application里面
	private ImageLoader mImageLoader;
	@Override
	public void onCreate() {
	
		// TODO Auto-generated method stub
		super.onCreate();
		instance = this;
		
		//初始化RequestQueue
		mQueue = Volley.newRequestQueue(this);
		//初始化mImageLoader
		
		mImageLoader = new ImageLoader(mQueue, new BitmapCache());
	}
	public static VolleyApplication getVolleyApplication(){
		return instance;
	}
	public RequestQueue getRequestQueue()
	{
		return mQueue;
	}
	public ImageLoader getImageLoader()
	{
		return mImageLoader;
	}
	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		
		super.onTerminate();
	}
}
