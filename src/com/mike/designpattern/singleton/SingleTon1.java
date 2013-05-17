package com.mike.designpattern.singleton;

public class SingleTon1 {
	private static SingleTon1 mInstance;
	
	private SingleTon1(){};
	
	public SingleTon1 getInstance() {
		if (null == mInstance) {
			mInstance = new SingleTon1();
		}
		return mInstance;
	}

}
