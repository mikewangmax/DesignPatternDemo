package com.mike.designpattern.factory;

import java.util.ArrayList;

import com.mike.designpattern.factory.ingredient.Cheese;
import com.mike.designpattern.factory.ingredient.Clams;
import com.mike.designpattern.factory.ingredient.Dough;
import com.mike.designpattern.factory.ingredient.Pepperoni;
import com.mike.designpattern.factory.ingredient.Sauce;
import com.mike.designpattern.factory.ingredient.Veggies;

public abstract class Pizza {
	protected String mName;
	protected Dough mDough;
	protected Sauce mSauce;
	protected Veggies[] mVeggies;
	protected Cheese mCheese;
	protected Pepperoni mPepperoni;
	protected Clams mClams;
	
	protected ArrayList<String> mToppings = new ArrayList<>();

	abstract void prepare() ;

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
