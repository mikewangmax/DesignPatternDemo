package com.mike.designpattern.example.others.composite.example0;

public class Client {
    public static void main(String[] args) {
        Food bread = new Bread();
        Food giblet = new Giblet();
        Food lard = new Lard();

        System.out.println("--------- 1----------");
        Food compositeFood1 = new CompositeFood();
        compositeFood1.add(bread);
        compositeFood1.add(giblet);
        compositeFood1.doSomething();

        System.out.println("--------- 2----------");

        Food compositeFood2 = new CompositeFood();
        compositeFood2.add(bread);
        compositeFood2.add(giblet);
        compositeFood2.add(lard);
        compositeFood2.doSomething();

        System.out.println("--------- 3----------");
        Food compositeFood3 = new CompositeFood();
        compositeFood3.add(compositeFood1);
        compositeFood3.add(compositeFood2);
        compositeFood3.doSomething();


    }
}
