package com.mike.designpattern.factory;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		mName = "ChicagoStyleCheesePizza";
		mDough = "ChicagoStyleCheesePizzaDough";
		mSauce = "ChicagoStyleCheesePizzaSauce";
		mToppings.add("ChicagoStyleCheesePizzaToppings");
	}
}
