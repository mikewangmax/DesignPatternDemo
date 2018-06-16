package com.mike.designpattern.example.headfirst.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	
	public String sayHello() throws RemoteException;

}
