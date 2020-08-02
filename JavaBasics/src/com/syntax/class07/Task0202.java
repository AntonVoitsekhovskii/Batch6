package com.syntax.class07;

import java.util.Scanner;

public class Task0202 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, luckynum = 17;
		
		do {
			System.out.println("Please enter any number");
			num = scan.nextInt();
		} while (num != luckynum);
		
		System.out.println("Gongrats!!!");
		
	}
}
