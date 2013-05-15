package com.mike.designpattern.factory;

import com.mike.designpattern.factory.ingredient.ChicagoPizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore{
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza(ingredientFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza(ingredientFactory);
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVegglePizza(ingredientFactory);
		}
		return pizza;
	}
}
