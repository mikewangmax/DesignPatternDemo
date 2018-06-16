package com.mike.designpattern.example.headfirst.adapter1;

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
