package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		
		List <Exception> e = except();
		for(Exception ex : e) {
			ex.printStackTrace();
			System.out.println();
		}

	}
	
	public static List<Exception> except() {
		
		List<Exception> exc = new ArrayList<>();
		
		String str = "Hello";
		try {
			char ch = str.charAt(10);
		}
		catch (StringIndexOutOfBoundsException se) {
			exc.add(se);
		}
		
		
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
		}
		catch (ArithmeticException ae) {
			exc.add(ae);
		}
		
		
		String path = "";
		try {
			FileInputStream fis = new FileInputStream(path);
		}
		catch (FileNotFoundException fne) {
			exc.add(fne);
		}
		
		int [] arr = {10, 5, 12};
		try {
			int i = arr[3];
		}
		catch (ArrayIndexOutOfBoundsException abe) {
			exc.add(abe);
		}
			
		return exc;	
	}

}
