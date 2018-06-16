package com.mike.designpattern.example.others.facotry.example2.factory;

import com.mike.designpattern.example.others.facotry.example2.product.ScrollBar;
import com.mike.designpattern.example.others.facotry.example2.product.Window;

public abstract class WidgetFactory {
    public abstract ScrollBar createScrollBar();
    public abstract Window createWindow();
}
