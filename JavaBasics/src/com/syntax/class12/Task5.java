package com.syntax.class12;

public class Task5 {

	public static void main(String[] args) {
		
		String str = "**2JZGTE** is better engine than $$RB24$$";
		
		int i = str.replaceAll("[^a-zA-Z]", "").length();
		
		System.out.println(i);
	}
}
