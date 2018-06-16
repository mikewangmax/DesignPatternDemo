package com.mike.designpattern.example.headfirst.command;


public class SimpleRemoteControl2WithUndoTest {
	public static void main(String[] args) {
		SimpleRemoteControl2WithUndo simpleRemoteControl2WithUndo = new SimpleRemoteControl2WithUndo();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		simpleRemoteControl2WithUndo.setCommand(0, lightOnCommand, lightOffCommand);
		simpleRemoteControl2WithUndo.onButtonWasPushed(0);
		
		System.out.println(simpleRemoteControl2WithUndo.toString());
		simpleRemoteControl2WithUndo.offButtonWasPushed(0);
		System.out.println(simpleRemoteControl2WithUndo.toString());
		
		simpleRemoteControl2WithUndo.undoButtonWasPushed();
		System.out.println(simpleRemoteControl2WithUndo.toString());
		
	}
}
