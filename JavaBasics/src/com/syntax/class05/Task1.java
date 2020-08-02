package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Please enter your height in inch");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		if (height < 60) {
			System.out.println("You are short");
		}
		else if(height > 60 && height < 73) {
			System.out.println("You are medium");
		}
		else {
			System.out.println("You are tall");
		}
		scan.close();
	}

}
