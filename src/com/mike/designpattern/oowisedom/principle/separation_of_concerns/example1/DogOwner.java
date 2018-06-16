package com.mike.designpattern.oowisedom.principle.separation_of_concerns.example1;

public class DogOwner {

    private Dog myDog;
    private Food dogFood;

    public void buyDogFood(Food food){
        this.dogFood = food;
    }

    public void feedDog() {
        myDog.eatFood(dogFood);
    }
}
