package com.syntax.class05;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much your sales are?");
		double sale = scan.nextDouble();
		double comm;
		if(sale > 0 && sale < 101) {
			comm = sale * 0.1;
		}
		else if(sale > 99 && sale < 201) {
			comm = sale * 0.2;
		}
		else if(sale > 200 && sale < 501) {
			comm = sale * 0.3;
		}
		else {
			comm = sale * 0/5;
		}
		System.out.println("Your commision is " + comm);
		if(comm > 100) {
			System.out.println("You are an awesome seller");
		}
	}
}
