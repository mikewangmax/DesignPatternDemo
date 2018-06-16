package com.mike.designpattern.example.others.strategy;

public class Context {

    protected IAlgorithm algorithm;

    public Context(IAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public boolean compress(String from, String to) {
        return this.algorithm.compress(from, to);
    }

    public boolean uncompress(String from, String to) {
        return algorithm.uncompress(from, to);
    }
}
