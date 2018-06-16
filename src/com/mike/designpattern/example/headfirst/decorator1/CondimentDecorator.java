package com.mike.designpattern.example.headfirst.decorator1;

public abstract class CondimentDecorator extends Beverage {
	
	public abstract String getDescription();

	public abstract double cost();

}
