package com.mike.designpattern.example.others.command;

public class Invoker {
    private ICommand command = null;

    public Invoker(ICommand command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
