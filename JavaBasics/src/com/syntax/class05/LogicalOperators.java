package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String day = scan.nextLine();
		if(day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");// TODO Auto-generated method stub
		}
		else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today is Java Class");
		}
		else if(day.equals("Thirsday")) {
			System.out.println("Today is Review Class");
		}
		else {
			System.out.println("Today is no Classes");
		}
	}

}
