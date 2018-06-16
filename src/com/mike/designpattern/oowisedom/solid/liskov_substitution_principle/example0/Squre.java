package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example0;

public class Squre {
    private int width;
    private int height;
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public int getWidth() {
        return this.width;
    }
}
