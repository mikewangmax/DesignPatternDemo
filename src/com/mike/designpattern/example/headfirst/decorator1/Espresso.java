package com.mike.designpattern.example.headfirst.decorator1;

public class Espresso extends Beverage{

	public Espresso() {
		mDescription = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
