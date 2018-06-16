package com.mike.designpattern.oowisedom.principle.keep_related_data_and_behaviour_together;

/**
 * principle content:
 *
 * keep the attributes and actions together
 */
public class Student {
    private String name;
    private int id;

    public void display() {
        System.out.print(this.name + this.id);
    }

}
