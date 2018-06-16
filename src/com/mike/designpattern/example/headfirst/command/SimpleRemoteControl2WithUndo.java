package com.mike.designpattern.example.headfirst.command;

public class SimpleRemoteControl2WithUndo {
	
	private Command[] onCommands;
	private Command[] offCommands;
	
	private Command undoCommand;
	
	public SimpleRemoteControl2WithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public void undoButtonWasPushed() {
		undoCommand.execute();
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<7; i++) {
			sb.append("[ slot " + i + " ]" + onCommands[i].getClass().getName() + "--" + offCommands[i].getClass().getName() + "\n");
			
		}
		return sb.toString();
	}
}
