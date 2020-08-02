package com.syntax.class07;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 1;
		System.out.println("Please enter your number from 1-20");
		while (num != 17) {
			num = scan.nextInt();	
		if (num == 17) {
			System.out.println("Gongrats!!!");
		}
		else {
			System.out.println("Try again");
		}
		}
}

}
