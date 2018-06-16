package com.mike.designpattern.example.others.facotry.example0.factory;

import com.mike.designpattern.example.others.facotry.example0.product.Operator;

public abstract class Vehicle {
    protected Operator operator;

    public Vehicle() {
        this.operator = operatorFactory();
    }

    public void run() {
        operator.operate();
    }


    protected abstract Operator operatorFactory();
}
