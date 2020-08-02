package com.syntax.class10;

public class Task2 {
	public static void main(String[] args) {
		int[] array = {5, 7, 12, 67, 3};
		int sum = 0, sum1 = 0;
		for(int i = 0; i < array.length; i++){
				sum += array[i]; 
		}
		System.out.println("Sum of all elements is " + sum);
	

	System.out.println("------------------------");
	for(int i: array) {
		sum1 += i;
	}
	System.out.println(sum1);
}
}