package com.syntax.class08;

public class Task2 {
	public static void main(String[] args) {
		for(int i = 1; i < 51; i++) {
			if(i % 3 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
	}
}
