package com.mike.designpattern.decorator1;

public class Decaf extends Beverage{
	
	public Decaf() {
		mDescription = "Decaf";
	}

	@Override
	public double cost() {
		return 1.05;
	}
}
