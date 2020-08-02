package com.syntax.class01;

public class Hello {

	public static void main (String[] args) {
		
		String s = "computer science";
		char ch = 'e';
		String str = Character.toString(ch);
		s = s.replaceAll(str, "*");
		System.out.println(s);
		
		
}
}
