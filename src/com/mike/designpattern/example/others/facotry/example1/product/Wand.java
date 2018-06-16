package com.mike.designpattern.example.others.facotry.example1.product;

public class Wand extends Weapon {
    @Override
    public void hit() {
        System.out.println("Hit by Wand");
    }


    @Override
    public String toString() {
        return "I am a wand";
    }

}
