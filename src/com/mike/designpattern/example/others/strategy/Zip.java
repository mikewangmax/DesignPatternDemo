package com.mike.designpattern.example.others.strategy;

public class Zip implements IAlgorithm{
    @Override
    public boolean compress(String from, String to) {
        System.out.println(from + " --> " +to + " Zip compress succeed!");
        return true;
    }

    @Override
    public boolean uncompress(String from, String to) {
        System.out.println(from + " --> " +to + " zip uncompress succeed!");
        return true;
    }
}
