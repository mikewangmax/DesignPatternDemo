package com.mike.designpattern.example.others.facotry.example1.product;

public class Sword extends Weapon{
    @Override
    public void hit() {
        System.out.println("Hit by Sword");
    }

    @Override
    public String toString() {
        return "I am a sword";
    }


}
