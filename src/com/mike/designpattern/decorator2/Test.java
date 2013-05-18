package com.mike.designpattern.decorator2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		try {
			InputStream in = new UpperCaseToLowerCaseInputStream(new BufferedInputStream(
					new FileInputStream("E:/test.txt")));
			int c ;
			while ((c = in.read()) >= 0) {
				System.out.println((char)c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
