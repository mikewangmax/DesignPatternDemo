package com.mike.designpattern.example.others.command;

public class ConcreteCommand implements ICommand{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
        System.out.println("ConcreteCommand execute()");
    }
}
