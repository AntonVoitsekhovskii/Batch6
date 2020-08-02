package com.syntax.replit;

public class Main133 {
	public static String alphabetical(String str) {

		char prev = str.charAt(0);
		char next = 0;
		String newString = prev + "";

		for (int i = 1; i < str.length(); i++) {
			next = str.charAt(i);
			if (next > prev) {
				newString += str.charAt(i);
			}
			prev = next;
		}
		return newString;
	}
	public static void main(String[] args){
		System.out.println(alphabetical("hello")); //"hlo"
		System.out.println(alphabetical("software")); 
		System.out.println(alphabetical("language"));
	}
}