package com.mike.designpattern.example.headfirst.adapter1;

public class DuckToTurkeyObjectAdapter implements ITurkey{
	private IDuck mDuck;
	
	public DuckToTurkeyObjectAdapter (IDuck duck) {
		mDuck = duck;
	}

	@Override
	public void gobble() {
		mDuck.quack();
		
	}

	@Override
	public void fly() {
		mDuck.fly();
	}

}
