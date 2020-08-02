package com.syntax.class18;

public class Task2 {
	
	String name;
	int grade1, grade2, grade3;
	int averGrage;
	
	Task2(String name, int grade1, int grade2, int grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}
	
	public int averageGrade() {
		return (grade1 + grade2 + grade3) / 3 ;
	}
	
	public static void main(String[] args) {
		
		Task2 student1 = new Task2("Anton", 5, 4, 5);
		System.out.println("Student " + student1.name + " average grade is " +student1.averageGrade());
		Task2 student2 = new Task2("Paul", 5, 5, 5);
		System.out.println("Student " + student2.name + " average grade is " +student2.averageGrade());
	}
	

}
