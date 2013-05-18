package com.mike.designpattern.decorator1;

public class Soy extends CondimentDecorator{
	
	private static double PRICE = 0.10;
	private Beverage mBenverage;
	
	public Soy(Beverage benverage) {
		mBenverage = benverage;
	}

	@Override
	public String getDescription() {
		return mBenverage.getDescription() + "Soy";
	}

	@Override
	public double cost() {
		return PRICE + mBenverage.cost();
	}

}
