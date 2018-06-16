package com.mike.designpattern.example.others.facotry.example2.factory;

import com.mike.designpattern.example.others.facotry.example2.product.ScrollBar;
import com.mike.designpattern.example.others.facotry.example2.product.Window;
import com.mike.designpattern.example.others.facotry.example2.product.WindowsScrollbar;
import com.mike.designpattern.example.others.facotry.example2.product.WindowsWindow;

public class WindowsWidgetFactory extends WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollbar();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }


}
