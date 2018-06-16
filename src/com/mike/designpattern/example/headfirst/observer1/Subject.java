package com.mike.designpattern.example.headfirst.observer1;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	
}
