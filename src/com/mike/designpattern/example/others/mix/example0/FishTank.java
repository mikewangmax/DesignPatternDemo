package com.mike.designpattern.example.others.mix.example0;

public class FishTank {
    private static FishTank instance;

    private FishTank() {}

    public FishTank getTank() {
        if (null == instance) {
            instance = new FishTank();
        }

        return instance;
    }
}
