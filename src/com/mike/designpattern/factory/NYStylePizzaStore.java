package com.mike.designpattern.factory;

public class NYStylePizzaStore extends PizzaStore{
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVegglePizza();
		}
		return pizza;
	}
}
