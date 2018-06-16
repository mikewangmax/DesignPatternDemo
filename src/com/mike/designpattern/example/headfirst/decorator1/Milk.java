package com.mike.designpattern.example.headfirst.decorator1;

public class Milk extends CondimentDecorator{
	
	private static double PRICE = 0.10;
	private Beverage mBenverage;
	
	public Milk(Beverage benverage) {
		mBenverage = benverage;
	}

	@Override
	public String getDescription() {
		return mBenverage.getDescription() + "Milk";
	}

	@Override
	public double cost() {
		return PRICE + mBenverage.cost();
	}

}
