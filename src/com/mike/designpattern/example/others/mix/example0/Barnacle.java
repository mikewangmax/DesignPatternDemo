package com.mike.designpattern.example.others.mix.example0;

public class Barnacle extends ParasiteDecorator {
    public Barnacle(Fish fish) {
        super(fish);
    }

    @Override
    public void spawn() {
        super.spawn();
    }
}
