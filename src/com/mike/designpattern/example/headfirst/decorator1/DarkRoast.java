package com.mike.designpattern.example.headfirst.decorator1;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		mDescription = "DarkRoast";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
