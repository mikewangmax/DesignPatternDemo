package com.mike.designpattern.example.others.strategy;

public class Gzip implements IAlgorithm{
    @Override
    public boolean compress(String from, String to) {
        System.out.println(from + " --> " +to + " Gzip compress succeed!");
        return true;
    }

    @Override
    public boolean uncompress(String from, String to) {
        System.out.println(from + " --> " +to + " Gzip uncompress succeed!");
        return true;
    }
}
