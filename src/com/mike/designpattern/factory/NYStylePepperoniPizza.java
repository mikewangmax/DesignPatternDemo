package com.mike.designpattern.factory;

public class NYStylePepperoniPizza extends Pizza {
	public NYStylePepperoniPizza() {
		mName = "NYStylePepperoniPizza";
		mDough = "NYStylePepperoniPizzaDough";
		mSauce = "NYStylePepperoniPizzaSauce";
		mToppings.add("NYStylePepperoniPizzaToppings");
	}
}
