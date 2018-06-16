package com.mike.designpattern.example.others.strategy;

public interface IAlgorithm {
    public boolean compress(String source, String to);

    public boolean uncompress(String source, String to);
}
