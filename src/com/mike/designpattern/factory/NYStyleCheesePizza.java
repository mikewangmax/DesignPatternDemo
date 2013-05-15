package com.mike.designpattern.factory;

import com.mike.designpattern.factory.ingredient.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
	private PizzaIngredientFactory mIngredientFactory;
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		mIngredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() {
		 mDough = mIngredientFactory.createDough();
		 mSauce = mIngredientFactory.createSauce();
		 mVeggies = mIngredientFactory.createVeggies();
		 mCheese = mIngredientFactory.createCheese();
		 mPepperoni = mIngredientFactory.createPepperoni();
		 mClams = mIngredientFactory.createClam();
	}
}
