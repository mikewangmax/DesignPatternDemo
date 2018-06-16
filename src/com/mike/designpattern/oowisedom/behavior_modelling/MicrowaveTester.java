package com.mike.designpattern.oowisedom.behavior_modelling;

public class MicrowaveTester {


    public void test() {
        Microwave m = new Microwave();
        m.setTime();
        m.start();
        m.end();
    }
}
