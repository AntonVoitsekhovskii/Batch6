package com.syntax.class30;

public class HW1 {

	public static void main(String[] args) {
		
		

	}

}

class Person {
	private String name;
	private String lastName;
	private int age;
	private double salary;
	
	Person(String name, String lastName, int age, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(name + " " + lastName + " " + age + " " + salary);
	}
}