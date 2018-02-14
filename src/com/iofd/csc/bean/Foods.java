package com.iofd.csc.bean;

import com.iofd.csc.R;

public class Foods {
	public String name;
	public int pic = R.drawable.food1;
	public String price;
	public String say;
	public String num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSay() {
		return say;
	}

	public void setSay(String say) {
		this.say = say;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Foods(String name, String pic, String price, String say, String num) {
		super();
		this.name = name;
		this.price = price;
		this.say = say;
		this.num = num;
	}

	public Foods() {
		super();
		// TODO Auto-generated constructor stub
	}

}
