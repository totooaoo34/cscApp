package application;

import java.util.ArrayList;
import java.util.List;

import android.app.Application;

import com.iofd.csc.bean.Foods;

public class CscApp extends Application{
	public static List<Foods> buyCar;

	public CscApp() {
		// TODO Auto-generated constructor stub
		buyCar = new ArrayList<Foods>();
	}
}
