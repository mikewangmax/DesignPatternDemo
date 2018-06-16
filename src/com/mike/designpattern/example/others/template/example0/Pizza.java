package com.mike.designpattern.example.others.template.example0;

public abstract class Pizza {


    public void makePizza() {
        makeBase();
        makeTopping();
        addSource();
        addCheese();
    }

    protected abstract void addSource();

    protected abstract void addCheese();

    protected abstract void makeTopping();

    public abstract void makeBase();



}
