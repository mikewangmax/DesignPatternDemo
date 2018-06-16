package com.mike.designpattern.example.headfirst.adapter1;

public class TurkeyToDuckObjectAdapter implements IDuck{
	private ITurkey mTurkey;
	
	public TurkeyToDuckObjectAdapter(ITurkey turkey) {
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
