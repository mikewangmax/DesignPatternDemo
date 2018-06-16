package com.mike.designpattern.example.headfirst.proxy.gumball;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		
		GumballMachineRemote machine;
		int count;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		try {
			count = Integer.parseInt(args[1]);
			machine = new GumballMachine(args[0], count);
			Naming.bind("//" + args[0] + "/gumballmachine", machine);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
}
