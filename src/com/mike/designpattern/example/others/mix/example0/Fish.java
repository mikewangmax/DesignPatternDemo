package com.mike.designpattern.example.others.mix.example0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Observable;

public abstract  class Fish extends Observable {
    private ArrayList<Fish> fishList;
    public void swim() {};

    public void add(Fish fish) {
        fishList.add(fish);
    }

    public void remove(Fish fish) {
        fishList.remove(fish);
    }

    public abstract void spawn();
}
