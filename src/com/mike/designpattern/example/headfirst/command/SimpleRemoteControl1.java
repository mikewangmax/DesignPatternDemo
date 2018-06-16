package com.mike.designpattern.example.headfirst.command;

public class SimpleRemoteControl1 {
	
	private Command command;
	
	public SimpleRemoteControl1() {}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed() {
		command.execute();
	}

	
}
