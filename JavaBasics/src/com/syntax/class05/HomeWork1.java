package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double quiz;
		double midTerm;
		double finalScore;
			System.out.println("Please enter quiz scores");
		quiz = scan.nextDouble();
			System.out.println("Please enter mid term scores");
		midTerm = scan.nextDouble();
		String a = scan.nextLine();
			finalScore = quiz + midTerm;
			if(finalScore >= 90) {
				a = "A";
			}
			else if(finalScore >= 70 && finalScore < 90) {
				a = "B";
			}
			else if(finalScore >=50 && finalScore <70) {
				a = "C";
			}
			else if(finalScore <50) {
				a = "F";
			}
		System.out.println("Your final score is " + a);
		scan.close();
	}
}
