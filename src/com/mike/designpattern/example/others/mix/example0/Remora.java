package com.mike.designpattern.example.others.mix.example0;

public class Remora extends ParasiteDecorator {
    public Remora(Fish fish) {
        super(fish);
    }

    @Override
    public void spawn() {
        super.spawn();
    }
}
