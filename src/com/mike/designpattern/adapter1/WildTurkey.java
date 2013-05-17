package com.mike.designpattern.adapter1;

public class WildTurkey implements ITurkey{

	@Override
	public void gobble() {
		System.out.println("gobble");
	}

	@Override
	public void fly() {
		System.out.println("fly");
	}

}
