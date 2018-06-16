package com.mike.designpattern.example.headfirst.adapter1;

public class Test {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		
		//adapter turkey to duck
		WildTurkey wildTurkey = new WildTurkey();
		IDuck turkeyDuck = new TurkeyToDuckObjectAdapter(wildTurkey);
		
		testDuck(mallardDuck);
		testDuck(turkeyDuck);
	}
	
	static void testDuck(IDuck duck) {
		duck.quack();
		duck.fly();
	}

}
