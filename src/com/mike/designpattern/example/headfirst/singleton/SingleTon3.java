package com.mike.designpattern.example.headfirst.singleton;

public class SingleTon3 {
	private static SingleTon3 mInstance;
	
	private SingleTon3(){};
	
	public SingleTon3 getInstance() {
		if (null == mInstance) {
			synchronized (SingleTon3.class) {
				mInstance = new SingleTon3();
			}
		}
		return mInstance;
	}

}
