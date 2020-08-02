package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		char grade;
		Scanner scan = new Scanner(System.in);
		String expl;
		System.out.println("Please enter your grade");
		grade = scan.next().charAt(0);
		 
		switch(grade) {
		case 'a':
			expl = "Excellent";
			break;
		case 'b':
			expl = "Good";
			break;
		case 'c':
			expl = "Average";
			break;
		case 'd':
			expl = "Bad";
			break;
		default:
			expl = "Not Accepltable";
		}
		System.out.println("Your grade is " + expl);
	}

}
