package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			String name1, name2, baby;
			System.out.print("Mom's first name? ");
			name1 = scan.nextLine();
			System.out.print("Dad's first name? ");
			name2 = scan.nextLine();
			System.out.print("Boy or Girl? ");
			baby = scan.nextLine();
				if(baby.equals("girl")) {
					name2 = name2.substring(0, name2.length()/2);
					name1 = name1.substring(name1.length()/2, name1.length());
					baby = name2.concat(name1);
					System.out.println(baby.toUpperCase());
				}
				else {
					name1 = name1.substring(0, name1.length()/2);
					name2 = name2.substring(name2.length()/2, name2.length());
					baby = name1.concat(name2);
					System.out.println(baby.toUpperCase());
				}
			
		}
}
