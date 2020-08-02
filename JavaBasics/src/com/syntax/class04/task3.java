package com.syntax.class04;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much money do you need?");
		int ask = scan.nextInt();
			if(ask < 200000) {
				System.out.println("We will lend you the money!");
			}
			else {
				System.out.println("I am sorry we can not lend the money.");
			}
	}
}
