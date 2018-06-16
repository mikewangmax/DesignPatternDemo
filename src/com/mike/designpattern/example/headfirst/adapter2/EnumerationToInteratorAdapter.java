package com.mike.designpattern.example.headfirst.adapter2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("rawtypes")
public class EnumerationToInteratorAdapter implements Iterator<List>{
	
	private Enumeration<List> mEnumeration;
	public EnumerationToInteratorAdapter(Enumeration<List> enumeration) {
		mEnumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return mEnumeration.hasMoreElements();
	}

	@Override
	public List next() {
		return mEnumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();// do not support this method
	}
	
}
