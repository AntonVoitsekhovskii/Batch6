package com.syntax.class22;

public class Student {
	String name;
	int stNum;
	
	void study() {
		System.out.println("Student stydies");
	}
	
	void dHomework() {
		System.out.println("Student do homework");
	}
	
	
}

class SyntaxStudent extends Student {
	
	@Override
	void study() {
		System.out.println("Student coding");
	}	
	
	void getJod() {
		System.out.println("Syntax Student will have QA job");
	}
}

class CollegeStudent extends Student {
	
}

class SchoolStudent extends Student {
	
}