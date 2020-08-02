package com.syntax.class04;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		if(age < 18) {
			System.out.println("I am sorry we can not give you a driver license.");
		}
		else {
			System.out.println("You will need learner permit first.");
		}
	}
}
