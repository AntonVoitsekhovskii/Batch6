package com.syntax.class08;

import java.util.Scanner;

public class Task5ver2 {
	public static void main(String[] args) {
		Scanner s;
		String iteam;
		double price;
		double money;
		double amount = 0;
		double change;
		double remainingBalance;
		
		s = new Scanner(System.in);
		System.out.println("What are you byuing today");
		iteam = s.nextLine();
		System.out.println("What is the price for the " + iteam);
		price = s.nextDouble();
		
		do {
			System.out.println("Please give payment");
			money = s.nextDouble();
			amount += money;
			
			if(amount < price) {
				remainingBalance = price - money;
				System.out.println("Please give more " + remainingBalance);
			}
			else if (amount > price) {
				change = money - price;
				System.out.println("Here is your change " + change);
				break;
			}
			else {
				System.out.println("We got your correct payment");
			}
		}
		while(price != amount);
		
		System.out.println("Thank you for shopping");
		
	}
}
