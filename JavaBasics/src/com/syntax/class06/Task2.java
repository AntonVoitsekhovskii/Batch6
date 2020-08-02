package com.syntax.class06;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String country, lang;
		System.out.println("Please enter the country");
		country = scan.nextLine();
		switch (country.toLowerCase()) {
		
		case "russia":
			lang = "russian";
			break;
		case "australia":	
		case "america":
			lang = "english";
			break;
		case "india":
			lang = "hindu";
			break;
		case "ukraine":
			lang = "ukrainian";
			break;
		default:
			lang = "I do not know";
		}
		System.out.println("Language of your country is: " + lang);
		scan.close();
		
	}
}
