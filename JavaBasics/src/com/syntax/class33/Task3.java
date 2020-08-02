package com.syntax.class33;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	ageEligibility();
	}


	public static void ageEligibility() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age please");
		int age = scan.nextInt();
		if(age < 16) {
			throw new RuntimeException("You are too young");
		}
		else {
			System.out.println("Procced applying process");
		}
	}
}
