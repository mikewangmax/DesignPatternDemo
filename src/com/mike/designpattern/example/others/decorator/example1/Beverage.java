package com.mike.designpattern.example.others.decorator.example1;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
