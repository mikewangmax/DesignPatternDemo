package com.mike.designpattern.example.others.decorator.example0;


/**
 *
 * We can add, in effect, any number of behavior dynamically to an object at runtime by using aggregation as a substitute
 * for pure inheritance
 *
 * Aggregation lets us create a stack of objects
 *
 * Each decorator object in the stack is aggregated in a one-to-one relationship with the object below it in the stack.
 *
 * By combining aggregation and polymorphism, we can recursively invoke the same behavior down the stack and have the
 * behavior execute upwards from the concrete component object.
 */
public class Client {
    public static void main(String[] args) {
        Webpage webpage = new BasicWebpage();
        webpage = new AuthorizedWebpage(webpage);
        webpage = new AuthenticatedWebpage(webpage);
        webpage.display();
    }
}
