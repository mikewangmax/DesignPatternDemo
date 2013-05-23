package com.mike.designpattern.duck;

public class Test {
	public static void main(String[] args) {
		Duck duck = new Duck();
		FlyWithWing flyWithWing = new FlyWithWing();
		duck.setFlyBehavour(flyWithWing);
		duck.fly();
	}

}
