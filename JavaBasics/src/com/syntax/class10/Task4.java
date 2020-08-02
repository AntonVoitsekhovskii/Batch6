package com.syntax.class10;

public class Task4 {
	public static void main(String[] args) {
		int max = 0;
		int[] nums = {200, 30, -1, 900, 56, 787};
			for(int i: nums) {
				if(i > max) {
					max = i;
				}
			}
			System.out.println(max);
	}
}
