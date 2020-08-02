package com.syntax.class11;

public class Task2 {
	public static void main(String[] args) {
		
		String countries [][] = {
				{"Canada", "USA", "Mexico"},
				{"Brazil", "Argentina", "Colombia"},
				{"Italy", "Germany", "France"},
				{"China", "Japan", "India"},
				{"South Africa", "Nigeria", "Kenya"}
		};
		int sum = 0;
		
		for(String[] i:countries) {
			for(String j:i) {
				System.out.print(j + " "); 
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		for(int i = 0; i < countries.length; i++) {
			for(int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + " ");
				sum ++; 
			}
			System.out.println();
		}
		System.out.println("Total number of countries is " + sum);
	}
}
