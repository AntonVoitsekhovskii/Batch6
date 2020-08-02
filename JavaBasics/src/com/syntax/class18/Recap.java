package com.syntax.class18;

public class Recap {
	
	protected int sumFromAray(int[] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		Recap obj = new Recap();
		int[] array = {2, 7, 19, 857};
		System.out.println("total " + obj.sumFromAray(array));
	}
}
