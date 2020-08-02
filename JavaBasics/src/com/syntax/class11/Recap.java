package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		
		String[][] groceries = {
				{"cucumber", "potato", "carrot"},
				{"mango", "apple", "banana", "kiwi"},
				{"milk", "cheese", "yogurt"}
		};
		for(int i = 0; i < groceries.length; i++) {
			for(int j = 0; j < groceries[i].length; j++) {
				System.out.print(groceries[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
		
		for(String[] array:groceries) {
			for(String iteam: array) {
				System.out.print(iteam + " ");
			}
			System.out.println();
		}
	}

}
