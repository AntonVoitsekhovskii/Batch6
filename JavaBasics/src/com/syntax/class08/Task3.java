package com.syntax.class08;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Would you like to apply for credit card?");
			answer = scan.nextLine();
			if(answer.contentEquals("yes")) {
				break;
			}
		}
		System.out.println("Gongrats!");
	}
}
