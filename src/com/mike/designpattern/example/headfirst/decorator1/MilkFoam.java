package com.mike.designpattern.example.headfirst.decorator1;

public class MilkFoam extends CondimentDecorator{
	
	private static double PRICE = 0.10;
	private Beverage mBenverage;
	
	public MilkFoam(Beverage benverage) {
		mBenverage = benverage;
	}

	@Override
	public String getDescription() {
		return mBenverage.getDescription() + "MilkFoam";
	}

	@Override
	public double cost() {
		return PRICE + mBenverage.cost();
	}

}
