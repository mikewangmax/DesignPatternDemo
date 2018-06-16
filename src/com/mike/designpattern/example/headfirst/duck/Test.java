package com.mike.designpattern.example.headfirst.duck;

public class Test {
	public static void main(String[] args) {
		Duck duck = new Duck();
		FlyWithWing flyWithWing = new FlyWithWing();
		duck.setFlyBehavour(flyWithWing);
		duck.fly();
	}

}
