package com.mike.designpattern.example.others.decorator.example0;

/* Step 4: Inherit from the abstract decorator and implement the component interface with concrete decorator classes*/
public class AuthenticatedWebpage extends WebpageDecorator{
    public AuthenticatedWebpage(Webpage webpage) {
        super(webpage);
    }
    
    public void authenticateUser(){
        System.out.println("Authenticating user");
    }

    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }
}
