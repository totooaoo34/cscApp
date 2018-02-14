package com.iofd.csc.http;

import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.JsonObjectRequest;

public class ReqesetUrl {
	private RequestQueue mQueue;

	public ReqesetUrl() {
		mQueue = VolleyApplication.getVolleyApplication().getRequestQueue();
	}

	public void sentJSONRequest(String url, JSONObject jsonRequest,
			Listener<JSONObject> listener, ErrorListener errorListener) {
		JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url,
				jsonRequest, listener, errorListener);
		mQueue.add(jsonObjectRequest);
		mQueue.start();
	}
}