package com.mike.designpattern.factory;

import java.util.ArrayList;

public class Pizza {
	protected String mName;
	protected String mDough;
	protected String mSauce;
	protected ArrayList<String> mToppings = new ArrayList<>();

	public void prepare() {
		System.out.println("Pizza prepare" + mName);
		for (int i=0; i<mToppings.size(); i++) {
			System.out.println("   " + mToppings.get(i));
		}
	}

	void bake() {
		System.out.println("Pizza bake");
	}

	void cut() {
		System.out.println("Pizza cut");
	}

	void box() {
		System.out.println("Pizza box");
	}
	
	public String getName() {
		return mName;
	}

}
