package com.mike.designpattern.example.others.decorator.example0;

/* Step 2: Implement the interface with your base concrete component class*/
public class BasicWebpage implements Webpage {
    private String html = "html";
    private String styleSheet = "styleSheet";
    private String scripts = "scripts";

    @Override
    public void display() {
        /* Renders the HTML to the stylesheet, and run any embedded scripts */
        System.out.println("Basic web page");
    }
}
