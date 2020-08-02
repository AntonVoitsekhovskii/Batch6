package com.syntax.replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main165 {
	
	
	
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		double i = 0; 
		double j = 0;
		double sum = 0;
		
		while(i != -1) {
			i = scan.nextInt();
			sum = sum + i;
			j++;
		}
		sum = sum + 1;
		j = j - 1;
		System.out.println(sum);
		//System.out.println(j);
		//System.out.println(sum / j);
}
}



