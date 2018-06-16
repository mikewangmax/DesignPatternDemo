package com.mike.designpattern.example.headfirst.factory;

import com.mike.designpattern.example.headfirst.factory.ingredient.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends Pizza {
	private PizzaIngredientFactory mIngredientFactory;
	public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
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
