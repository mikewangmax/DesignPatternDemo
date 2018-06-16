package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example1;

public class Test {

    // shortcut to use live template : conmand + j
    public static void main(String[] args) throws Exception {
        Manager accountVP = new Manager();
        accountVP.firstName = "Emma";
        accountVP.lastName = "Stone";
        accountVP.calculatePerHourRate(4);


        Employee emp = new Manager();
        emp.firstName = "Tim";
        emp.lastName = "Corey";
        emp.assignManager(accountVP);
        emp.calculatePerHourRate(2);

        System.out.println(emp.firstName + "'s salary is :" + emp.salary);
    }

}
