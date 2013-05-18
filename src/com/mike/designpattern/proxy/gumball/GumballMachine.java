package com.mike.designpattern.proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	private String mLocation;
	private int mCount;
	
	public GumballMachine(String location, int count) throws RemoteException{
		mLocation = location;
		mCount = count;
	}

	@Override
	public int getCount() {
		return mCount;
	}

	@Override
	public String getLocation() {
		return mLocation;
	}

	@Override
	public State getState(){
		return new NoQuarterState();
	}

}
