package com.mike.designpattern.example.others.decorator.example1;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
