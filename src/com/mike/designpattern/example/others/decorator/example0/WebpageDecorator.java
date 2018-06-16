package com.mike.designpattern.example.others.decorator.example0;

/* Step 3: Implement the interface with your abstract decorator class */
public abstract class WebpageDecorator implements Webpage{
    protected Webpage page;

    public WebpageDecorator(Webpage webpage) {
        this.page = webpage;
    }

    @Override
    public void display() {
        this.page.display();
    }
}

