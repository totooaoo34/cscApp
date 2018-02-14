package com.iofd.csc.http;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.iofd.csc.bean.Constant;
import com.iofd.csc.bean.Foods;

public class MovieUtil {
	public static List<Foods> getJinghuaMovieList(JSONObject root) {
		List<Foods> list = new ArrayList<Foods>();
		try {
			JSONArray array = root
					.getJSONArray(Constant.JSON_TAG_MOVIEBEANLIST);

			for (int j = 0; j < array.length(); j++) {
				Foods food = new Foods();
				JSONObject mJson = array.getJSONObject(j);
				// movie.setName(mJson
				// .getString(Constant.JSON_TAG_MOVIEHEADNAME));
				// movie.setImageUrl(mJson
				// .getString(Constant.JSON_TAG_MOVIEBEANIMAGEPAHT));
				// movie.setMovieUrl(mJson.getString("play_path"));
				// listMovie.add(movie);
				list.add(food);
			}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
}
