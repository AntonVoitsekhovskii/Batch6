package com.syntax.class05;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of the day");
		int num = scan.nextInt();

		if (num > 0 && num < 6) {
			System.out.println("It is a weekday");
		} else if (num > 5 && num < 8) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		scan.close();
	}
}
