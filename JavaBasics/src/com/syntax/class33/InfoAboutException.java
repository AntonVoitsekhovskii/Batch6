package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		try {
		
		char ch = str.charAt(10);
		System.out.println(ch);
		
		}
		catch(StringIndexOutOfBoundsException se ) {
			// to get info about the exception
			//se.printStackTrace(); //name, message about exception, where it occurs
			//System.out.println(se); //name, message about exception
			System.out.println(se.getMessage()); //message about exception
		}
		System.out.println("---- END OF THE PROGRAM -----");
	}

}
