package com.mike.designpattern.example.others.decorator.example1;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
