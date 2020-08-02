package com.syntax.class11;

public class Task1 {
	public static void main(String[] args) {
	
		String [][] car = {
				{"Ford", "GMC", "Crysler"},
				{"Mercedes", "BMW", "VAG"},
				{"KIA", "Hundai", "SangYong"},
				{"Ferrari", "Maserati", "Lamborgini"}
		};
		
		for(String[] i:car) {
			for(String j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		for(int i = 0; i < car.length; i++) {
			for(int j = 0; j < car[i].length; j++) {
				System.out.print(car[i][j] + " ");
			}
			System.out.println();
		}
}
}
