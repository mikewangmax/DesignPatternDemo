package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example1;


public class CEO extends Employee{
    @Override
    public void calculatePerHourRate(int rank) {
        float baseAmount = 150;
        salary = baseAmount * rank;
    }

    @Override
    public void assignManager(Manager manager) throws Exception {
        System.out.println("The CEO has no manager");
        throw new Exception();
    }

    public void fireSomeone() {
        System.out.println("I will fire someone.");
    }
}
