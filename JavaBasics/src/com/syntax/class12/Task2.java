package com.syntax.class12;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(!str.isEmpty()) {
			if(str.length() % 2 != 0 && str.length() >= 3) {
					System.out.println(str.charAt(str.length() / 2));
				
			}
		}
	}
}
