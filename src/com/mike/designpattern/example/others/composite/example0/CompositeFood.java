package com.mike.designpattern.example.others.composite.example0;

public class CompositeFood extends Food{
    @Override
    public void doSomething() {
        System.out.println("CompositeFood doSomething");
        super.doSomething();
    }

    @Override
    public void add(Food food) {
        super.add(food);
    }

    @Override
    public void remove(Food food) {
        super.remove(food);
    }

    @Override
    public Food getChild(int i) {
        return super.getChild(i);
    }
}
