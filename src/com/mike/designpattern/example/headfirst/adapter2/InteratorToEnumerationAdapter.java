package com.mike.designpattern.example.headfirst.adapter2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings("rawtypes")
public class InteratorToEnumerationAdapter implements Enumeration<List>{
	
	private Iterator<List> mIterator;
	public InteratorToEnumerationAdapter(Iterator<List> iterator) {
		mIterator = iterator;
	}
	@Override
	public boolean hasMoreElements() {
		return mIterator.hasNext();
	}
	@Override
	public List nextElement() {
		return mIterator.next();
	}

}
