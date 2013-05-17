package com.mike.designpattern.adapter;

public class Test {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		
		//adapter turkey to duck
		WildTurkey wildTurkey = new WildTurkey();
		Duck turkeyDuck = new TurkeyAdapter(wildTurkey);
		
		testDuck(mallardDuck);
		testDuck(turkeyDuck);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
