package com.mike.designpattern.adapter2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

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
