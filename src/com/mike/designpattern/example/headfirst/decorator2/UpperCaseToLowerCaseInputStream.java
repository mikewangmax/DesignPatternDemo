package com.mike.designpattern.example.headfirst.decorator2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * function:
 *           ���������ڵ����д�д�ַ�ת��Сд��
 */
public class UpperCaseToLowerCaseInputStream extends FilterInputStream{

	protected UpperCaseToLowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1? c: Character.toLowerCase((char)c));
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
	
}
