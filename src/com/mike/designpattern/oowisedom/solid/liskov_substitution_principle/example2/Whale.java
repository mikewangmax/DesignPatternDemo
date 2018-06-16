package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example2;

public class Whale extends Animal{
    public Whale() {
        super(0, true);
    }

    private void swim() {};

    @Override
    public void run() {
        this.swim();
    }

    @Override
    public void wail() {
        swim();
    }
}
