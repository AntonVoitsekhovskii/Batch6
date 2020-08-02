package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth number");
		int month = scan.nextInt();
		String monthName;
		if(month >= 3 && month <= 5) {
			monthName = "Spring";
		}
		else if(month >=6 && month <= 8) {
			monthName = "Summer";
		}
		else if(month >= 9 && month <= 11) {
			monthName = "Autumn";
		}
		else if(month >= 1 && month <=2 || month==12) {
			monthName = "Winter";
		}
		else {
			monthName = "Invalid Month";
		}
		System.out.println("You were born in " + monthName);
		scan.close();
	}
	
}
