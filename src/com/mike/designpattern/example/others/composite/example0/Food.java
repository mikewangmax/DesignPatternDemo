package com.mike.designpattern.example.others.composite.example0;

import java.util.ArrayList;
import java.util.List;

public class Food {
    List<Food> childs = new ArrayList<Food>();

    public void doSomething() {
        for (int i = 0; i<childs.size(); i++) {
            childs.get(i).doSomething();
        }
    }

    public void add(Food food) {
        childs.add(food);
    }

    public void remove(Food food) {
        childs.remove(food);
    }

    public Food getChild(int i){
        return childs.get(i);
    }
}
