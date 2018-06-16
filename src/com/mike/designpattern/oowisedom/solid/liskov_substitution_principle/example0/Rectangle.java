package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example0;


/**
 * The Liskov Substitution Principle
 * Inheritance: The dark side
 * “If for each object o1of type S there is an object o2of type T such that
 * for all programs P defined in terms of T,
 * the behavior of P is unchanged when o1is substituted for o2then S is a subtype of T.”
 *
 * --Barbara Liskov, 1988
 */

public class Rectangle {
    private int width;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }
}
