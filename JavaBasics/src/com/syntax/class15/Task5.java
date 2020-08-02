package com.syntax.class15;

public class Task5 {

	public static void main(String[] args) {
		CreatingMethods met = new CreatingMethods();
		char k = met.returnGrade(70);
		System.out.println("Your grade is " + k);
	}

}

	class CreatingMethods {
		char returnGrade(int a) {
			char grade;
			if(a >= 90) {
			grade = 'A';
			}
			else if(a >= 80 && a < 90) {
			grade = 'B';
			}
			else if(a >= 70 && a < 80) {
			grade = 'C';
			}
			else {
				grade = 'F';
			}
			return grade;
		}
	}