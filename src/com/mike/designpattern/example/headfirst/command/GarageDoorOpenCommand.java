package com.mike.designpattern.example.headfirst.command;

public class GarageDoorOpenCommand implements Command{

	@Override
	public void execute() {
       System.out.println("GarageDoorOpenCommand execute");
	}

	@Override
	public void undo() {
		
	}

}
