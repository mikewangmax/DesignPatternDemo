package com.mike.designpattern.example.headfirst.factory;

import java.util.ArrayList;

import com.mike.designpattern.example.headfirst.factory.ingredient.Clams;
import com.mike.designpattern.example.headfirst.factory.ingredient.Dough;
import com.mike.designpattern.example.headfirst.factory.ingredient.Sauce;
import com.mike.designpattern.example.headfirst.factory.ingredient.Veggies;
import com.mike.designpattern.example.headfirst.factory.ingredient.Cheese;
import com.mike.designpattern.example.headfirst.factory.ingredient.Pepperoni;

public abstract class Pizza {
	protected String mName;
	protected Dough mDough;
	protected Sauce mSauce;
	protected Veggies[] mVeggies;
	protected Cheese mCheese;
	protected Pepperoni mPepperoni;
	protected Clams mClams;
	
	protected ArrayList<String> mToppings = new ArrayList<String>();

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
