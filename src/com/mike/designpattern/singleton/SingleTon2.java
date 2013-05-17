package com.mike.designpattern.singleton;

public class SingleTon2 {
	private static SingleTon2 mInstance;
	
	private SingleTon2(){};
	
	public synchronized SingleTon2 getInstance() {
		if (null == mInstance) {
			mInstance = new SingleTon2();
		}
		return mInstance;
	}

}
