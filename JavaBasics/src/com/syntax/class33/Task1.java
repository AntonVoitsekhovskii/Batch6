package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Please enter any number");
			int num = scan.nextInt();
		}
		catch(InputMismatchException ime) {
			ime.printStackTrace();
		}
	}

}
