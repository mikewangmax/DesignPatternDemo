package com.mike.designpattern.decorator1;

public class Mocha extends CondimentDecorator{

	private static double PRICE = 0.20;
	private Beverage mBenverage;
	
	public Mocha(Beverage benverage) {
		mBenverage = benverage;
	}
	
	@Override
	public String getDescription() {
		return mBenverage.getDescription() + " + Mocha";
	}

	@Override
	public double cost() {
		return PRICE + mBenverage.cost();
	}

}
