package com.mike.designpattern.example.headfirst.adapter1;

public class MallardDuck implements IDuck{

	@Override
	public void quack() {
		System.out.println("quack");
	}

	@Override
	public void fly() {
		System.out.println("fly");
	}
	

}
