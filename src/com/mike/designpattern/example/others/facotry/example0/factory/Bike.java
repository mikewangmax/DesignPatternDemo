package com.mike.designpattern.example.others.facotry.example0.factory;

import com.mike.designpattern.example.others.facotry.example0.product.Cyclist;
import com.mike.designpattern.example.others.facotry.example0.product.Operator;

public class Bike extends Vehicle{
    @Override
    protected Operator operatorFactory() {
        return new Cyclist();
    }
}
