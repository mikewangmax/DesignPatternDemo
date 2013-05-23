package com.mike.designpattern.duck;

public class Duck {
	
	private IFlyBehavour mFlyBehavour;
	
    public void fly () {
		if (null != mFlyBehavour) 
			mFlyBehavour.fly();
	}
	
	public void setFlyBehavour (IFlyBehavour behavour) {
		mFlyBehavour = behavour;
	}
}
