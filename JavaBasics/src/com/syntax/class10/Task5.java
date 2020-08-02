package com.syntax.class10;

public class Task5 {
	public static void main(String[] args) {
		String[][] month = {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June", "July", "August"},
				{"September", "October", "November"}				
		};
			int rows = month.length;
			int firstArray = month[0].length;
			
			for(int i = 0; i < month.length; i++) {
					for(int j = 0; j < month[i].length; j++) {
						System.out.print(month[i][j] + " ");
					}
			System.out.println();
			}
		
			
	}
}
