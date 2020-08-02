package com.syntax.class02;

public class Variables {
	public static void main(String[] args) {
		String name = "Anton";
		String lastName = "Voitsekhovskii";
		int grade = 4;
		String city = "Brooklyn";
		String state = "New York";
		long phoneNumber = 9176984755l;
		
		name = "Lisa";
		lastName = "Voitsekhovskaia";
		grade = 5;
		city = "Miami";
		state = "Florida";
		phoneNumber = 9175459844l;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println();
		
		System.out.println("My name is " + name + " and my last name is " + lastName);
		System.out.println("I live in city of " + city + " in sate " + state + " and my phone number is " + phoneNumber + "!");
	}
}
