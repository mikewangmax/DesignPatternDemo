package com.mike.designpattern.example.headfirst.command;

public class GarageDoorCloseCommand implements Command{

	@Override
	public void execute() {
       System.out.println("GarageDoorCloseCommand execute");
	}

	@Override
	public void undo() {
		
	}

}
