package com.mike.designpattern.oowisedom.principle.separation_of_concerns.example0;

public class StudentDialog {
    private Student student;

    public void display() {
        System.out.print(student.name + student.id);
    }
}
