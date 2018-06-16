package com.mike.designpattern.example.headfirst.duck;

public class FlyWithWing implements IFlyBehavour{
    @Override
    public void fly() {
      System.out.println("fly with wings");    	
    }
}
