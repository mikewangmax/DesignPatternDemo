package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example1;

public class Manager extends Employee{
    @Override
    public void calculatePerHourRate(int rank) {
        float baseAmount = 19.75f;
        salary = baseAmount + (rank * 4);
    }

    public void generatePerformanceReview() {
        // Simulate reviewing a direct report
        System.out.println("I'm reviewing a direct report's performance.");
    }
}
