package com.mike.designpattern.adapter;

public class TurkeyAdapter implements Duck{
	private Turkey mTurkey;
	
	public TurkeyAdapter(Turkey turkey) {
		mTurkey = turkey;
	}

	@Override
	public void quack() {
		mTurkey.gobble();
	}

	@Override
	public void fly() {
		mTurkey.fly();
	}

}
