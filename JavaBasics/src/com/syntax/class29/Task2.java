package com.syntax.class29;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		
		Set<Student> students = new LinkedHashSet<>();
		students.add(new Student("Anton", 123));
		students.add(new Student("Paul", 576));
		students.add(new Student("Max", 125));
		students.add(new Student("Ahmed", 666));
		
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()) {
			iter.next().display();
		}
		
		
	}

}

class Student {
	String name;
	int studID;
	
	Student(String name, int studID) {
		this.name = name;
		this.studID = studID;
	}
	
	void display() {
		System.out.println(name + " " + studID);
	}
	
}
