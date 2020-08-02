package com.syntax.class10;

public class Task3 {
	public static void main(String[] args) {
		String[] country = {"Russia", "Ukraine", "America", "Italy"};
		for(int i = 0; i < country.length; i++) {
			System.out.println(country[i]);
		}
		System.out.println();
		for(int i = 0; i < country.length; i++) {
			
			if(country[i].equals("America")) {
				System.out.println("Washington DC");
			}
			else if(country[i].equals("Russia")) {
				System.out.println("Moscow");
			}
			else if(country[i].equals("Ukraine")) {
				System.out.println("Kiev");
			}
			else if(country[i].equals("Italy")) {
				System.out.println("Rome");
			}
			
		}
		
	}
}
