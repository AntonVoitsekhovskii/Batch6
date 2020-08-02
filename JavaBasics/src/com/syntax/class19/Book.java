package com.syntax.class19;

public class Book {
	
	String name, writer;
	
	Book() {
		this("Metro2033", "Gluhovskii");
	}
	
	Book(String name, String writer) {
		System.out.println("New book " + name + " of " + writer + " was created!");
	}
	
	public static void main(String[] args) {
		Book book1 = new Book();
	}
}
