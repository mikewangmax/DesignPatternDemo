package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example1;

public class Employee {
    public String firstName;
    public String lastName;
    public Employee manager;
    public float salary;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void assignManager(Manager manager) throws Exception {
        this.manager = manager;
    }

    public float getSalary() {
        return salary;
    }

    public void calculatePerHourRate(int rank) {
        float baseAmount = 12.5f;
        salary = baseAmount + (rank * 2);
    }
}
