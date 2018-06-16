package com.mike.designpattern.example.headfirst.adapter1;

/*
 * Note:
 *        in some language, support multi-extend, so the DuckTurkeyClassAdapter can extends Duck and Turkey
 *        so this class is not implemented.
 *        
 */
public class DuckTurkeyClassAdapter extends Duck {

	public DuckTurkeyClassAdapter() {
	}

	@Override
	public void quack() {
	}

	@Override
	public void fly() {
	}

}
