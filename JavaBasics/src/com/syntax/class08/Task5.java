package com.syntax.class08;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String iteam, answer = "null";
		int price = 0, sum = 0, pay = 0, change = 0;
		for(int i = 1; i < 100; i++) {
			System.out.println("What iteam would you like to buy?");
			iteam = scan.next();
			System.out.println("What price is for this iteam?");
			price = scan.nextInt();
			sum = sum + price;
			System.out.println("Your total amount is " + sum + "$");
			System.out.println();
			System.out.println("Would you like to buy something else?");
			answer = scan.next();
				if(answer.equals("no")) {
					break;
				}
		}
		    System.out.println("Your total amount is " + "$" + sum);
			do {			
			pay = scan.nextInt();
			change = pay - sum;
				if(pay < sum) {
				System.out.println("You still have to pay " + "$" + (sum - pay));
				sum = sum - pay;
				continue;
				}
				else if(pay > sum) {
				System.out.println("Here is your change " + change);
				}
				else {
				System.out.println("We got your correct payement");
				}
			}
			while (pay != sum);
			
			System.out.println("Thank you for shopping");
	}
}
