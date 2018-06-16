package com.mike.designpattern.example.headfirst.proxy.gumball;

public class NoQuarterState  implements State{

	transient GumballMachine gumballMachine;
	
	@Override
	public void insertQuarter() {
	}

	@Override
	public void ejectQuarter() {
	}

	@Override
	public void turnCrank() {
	}

	@Override
	public void dispense() {
	}

}
