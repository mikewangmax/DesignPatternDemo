package com.mike.designpattern.example.others.facotry.example2.product;

public class NotifyScrollbar extends ScrollBar {
    @Override
    public void scroll() {
        System.out.println("NotifyScrollbar scroll()");
    }
}
