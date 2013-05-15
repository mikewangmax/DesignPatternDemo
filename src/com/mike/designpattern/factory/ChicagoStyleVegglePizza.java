package com.mike.designpattern.factory;

public class ChicagoStyleVegglePizza extends Pizza {
	public ChicagoStyleVegglePizza() {
		mName = "ChicagoStyleVegglePizza";
		mDough = "ChicagoStyleVegglePizzaDough";
		mSauce = "ChicagoStyleVegglePizzaSauce";
		mToppings.add("ChicagoStyleVegglePizzaToppings");
	}
}
