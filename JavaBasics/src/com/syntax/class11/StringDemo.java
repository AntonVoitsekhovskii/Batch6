package com.syntax.class11;

public class StringDemo {
	public static void main(String[] args) {
		String school = "Syntax";
		
		String str = new String("Hello");
				
		String str1 = "This a String 7676, &^&^";	
		
		System.out.println(school.length());
		
		int size = str.length();
		
		System.out.println(size);
		
		System.out.println(school.toUpperCase());
		System.out.println();
		
		char [] ar = school.toCharArray();
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
	}
}
