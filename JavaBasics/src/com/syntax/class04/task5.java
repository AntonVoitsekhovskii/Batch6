package com.syntax.class04;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your city.");
		
		String city = scan.nextLine();
		System.out.println("Please enter your temperature in Faringate.");
		
		int tempF = scan.nextInt();
		//double f = 75;
		double tempC = (tempF-32) * 5/9;
		int i = (int) tempC;
		
		System.out.println("The temperature in " + city + " in Celsium is " + i + " C");
		
	}
}
