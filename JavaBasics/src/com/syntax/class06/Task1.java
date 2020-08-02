package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sale;
		double price, finalPrice;
		int discount;
		price = 0;
		discount = 0;
		System.out.println("Is there any sale?");
		sale = scan.nextLine();
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price of the item?");
			price = scan.nextDouble();
			if (price <= 20) {
				discount = 10;
			} else if (price >= 20 && price < 100) {
				discount = 20;
			} else if (price >= 100 && price < 500) {
				discount = 30;
			} else {
				discount = 50;
			}
			finalPrice = price - price * (discount * 0.01);
			System.out.println("After discount " + discount + "% the price of the item reduced from " + price + "$ to "
					+ finalPrice + "$");
		} else {
			System.out.println("We are not going shoping today");
		}
		scan.close();

	}

}
