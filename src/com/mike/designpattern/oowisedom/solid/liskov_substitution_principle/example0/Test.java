package com.mike.designpattern.oowisedom.solid.liskov_substitution_principle.example0;

public class Test {

    /**
     *
     * In this case,  when we replace the parameter from Rectangle to Squre,
     *
     * because for Squre, the width and the height must be equal, so Squre is not the subtype of Recangel.
     *
     */
    private void foo1(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        if (r.getWidth() * r.getHeight() != 20)
            System.out.print("");
    }


    private void foo2(Squre r) { // replace
        r.setWidth(5);
        r.setHeight(4);
        if (r.getWidth() * r.getHeight() != 20)
            System.out.print("");
    }
}
