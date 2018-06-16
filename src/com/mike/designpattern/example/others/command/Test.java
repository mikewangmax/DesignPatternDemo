package com.mike.designpattern.example.others.command;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
