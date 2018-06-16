package com.mike.designpattern.example.others.facotry.example0.factory;

import com.mike.designpattern.example.others.facotry.example0.product.Operator;
import com.mike.designpattern.example.others.facotry.example0.product.Pilot;

public class Plane extends Vehicle{
    @Override
    protected Operator operatorFactory() {
        return new Pilot();
    }
}
