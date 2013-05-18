package com.mike.designpattern.decorator1;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		mDescription = "DarkRoast";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
