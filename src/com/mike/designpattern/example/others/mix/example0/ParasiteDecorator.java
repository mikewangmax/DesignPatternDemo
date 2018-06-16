package com.mike.designpattern.example.others.mix.example0;

public class ParasiteDecorator extends Fish{
    private Fish fish;

    public ParasiteDecorator(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void spawn() {

    }
}
