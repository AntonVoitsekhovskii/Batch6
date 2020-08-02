package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
		
		//Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		
		
		int a = 10;
		int b = 20;
	    
		a = a + b;//30
		b = a - b;//30 - 20 = 10
		a = a - b;//30 - 10 = 20
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println();
		String str1 = "Day"; 
		String str2 = "Night";
		
		str1 = str1 + str2;//DayNight
		str2 = str1.substring(0, str1.length() - str2.length());//(0, 8-5)
		str1 = str1.substring(str2.length());//(3)
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		System.out.println("------------------------");
		str1 += str2;
		str2 = str1.replace(str2, "");
		str1 = str1.replace(str2, "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println();
		System.out.println("============ Fibonacci  series =============== ");
		System.out.println();
		int l = 0, j = 1, k;
		for(int i = 0; i < 11; i ++) {
			System.out.print(l + " ");
			k = l + j;
			l = j;
			j = k;
		}
		
		System.out.println();
		
		String given = "I love Java";
		String reversed = "";
		for(int i = given.length() - 1; i >=0; i--) {
			reversed += given.charAt(i);
		}
		System.out.print(reversed);
		
		System.out.println();
		
		String[] arr = given.split(" ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
