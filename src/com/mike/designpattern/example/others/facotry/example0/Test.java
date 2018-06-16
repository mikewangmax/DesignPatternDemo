package com.mike.designpattern.example.others.facotry.example0;

import com.mike.designpattern.example.others.facotry.example0.factory.Bike;
import com.mike.designpattern.example.others.facotry.example0.factory.Plane;

public class Test {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();

        Plane plane = new Plane();
        plane.run();


    }
}
