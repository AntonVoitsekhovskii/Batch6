package com.syntax.class11;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userName, password, confPass;
		System.out.println("Please enter Username");
		userName = scan.nextLine();
		System.out.println("Please enter Password");
		password = scan.nextLine();
			if(userName.isEmpty() || password.isEmpty()) {
				System.out.println("Username or Password can not be empty");
			}	
			else if(password.length() <= 7) {
				System.out.println("Password is too short");
			}
			else if(password.contains(userName)) {
				System.out.println("Password can not contain username");
				}
				else {
				System.out.println("Please confirm Password");
				confPass = scan.nextLine();
					if(!password.equals(confPass)) {
					System.out.println("Passwords do not match");
					}
					else {
						System.out.println("Your acount has been created");
					}
					
			}
		scan.close();
	}
}
