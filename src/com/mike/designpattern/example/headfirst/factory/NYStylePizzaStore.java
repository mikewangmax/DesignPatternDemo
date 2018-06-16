package com.mike.designpattern.example.headfirst.factory;

import com.mike.designpattern.example.headfirst.factory.ingredient.NYPizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore{
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza(ingredientFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza(ingredientFactory);
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza(ingredientFactory);
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVegglePizza(ingredientFactory);
		}
		return pizza;
	}
}
