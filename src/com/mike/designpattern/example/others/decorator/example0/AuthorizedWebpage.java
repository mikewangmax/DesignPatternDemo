package com.mike.designpattern.example.others.decorator.example0;

/* Step 4: Inherit from the abstract decorator and implement the component interface with concrete decorator classes*/
public class AuthorizedWebpage extends WebpageDecorator{
    public AuthorizedWebpage(Webpage webpage) {
        super(webpage);
    }

    public void authorizedUser(){
        System.out.println("Authorizing user");
    }

    @Override
    public void display() {
        super.display();
        this.authorizedUser();
    }
}
