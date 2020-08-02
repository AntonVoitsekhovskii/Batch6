package com.syntax.class03;

import java.util.Scanner;

public class InterviewTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number ");
		
		int i = sc.nextInt();
		
		if(i % 2 == 0) {
			System.out.println("Your number is Even");
		}
		else {
			System.out.println("Your number is Odd");
		}
		
		sc.close();
	}
}
