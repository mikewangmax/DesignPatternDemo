package com.mike.designpattern.example.others.facotry.example1.product;

public abstract class Weapon {
    public abstract void hit();

    @Override
    public String toString() {
        return "I am a weapon";
    }
}
