package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example2;


/**
 *
 * If we use Whale to replace Animal, we will find the final walk becomes to swim(),
 *
 * so, it changes the behaviours of super class.
 *
 */
public class Animal {
    private int numberOfLegs;
    private boolean hasTail;

    public Animal(int legs, boolean tail) {
        this.numberOfLegs = legs;
        this.hasTail = tail;
    }

    public void wail() {};

    public void run() {};

    public void eat() {};
}
