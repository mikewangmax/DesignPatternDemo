package com.mike.designpattern.example.others.facotry.example2.factory;

import com.mike.designpattern.example.others.facotry.example2.product.NotifyScrollbar;
import com.mike.designpattern.example.others.facotry.example2.product.NotifyWindow;
import com.mike.designpattern.example.others.facotry.example2.product.ScrollBar;
import com.mike.designpattern.example.others.facotry.example2.product.Window;

public class NotifyWidgetFactory extends WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new NotifyScrollbar();
    }

    @Override
    public Window createWindow() {
        return new NotifyWindow();
    }
}
