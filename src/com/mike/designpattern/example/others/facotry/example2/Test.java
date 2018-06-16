package com.mike.designpattern.example.others.facotry.example2;

import com.mike.designpattern.example.others.facotry.example2.factory.NotifyWidgetFactory;
import com.mike.designpattern.example.others.facotry.example2.factory.WindowsWidgetFactory;
import com.mike.designpattern.example.others.facotry.example2.product.ScrollBar;
import com.mike.designpattern.example.others.facotry.example2.product.Window;

public class Test {
    public static void main(String[] args) {
        ScrollBar scrollBar = new WindowsWidgetFactory().createScrollBar();
        scrollBar.scroll();

        scrollBar = new NotifyWidgetFactory().createScrollBar();
        scrollBar.scroll();


        Window window = new WindowsWidgetFactory().createWindow();
        window.assembly();

        window = new NotifyWidgetFactory().createWindow();
        window.assembly();

    }
}
