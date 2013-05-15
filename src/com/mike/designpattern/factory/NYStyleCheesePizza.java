package com.mike.designpattern.factory;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		mName = "NYStyleCheesePizza";
		mDough = "NYStyleCheesePizzaDough";
		mSauce = "NYStyleCheesePizzaSauce";
		mToppings.add("NYStyleCheesePizzaToppings");
	}
}
