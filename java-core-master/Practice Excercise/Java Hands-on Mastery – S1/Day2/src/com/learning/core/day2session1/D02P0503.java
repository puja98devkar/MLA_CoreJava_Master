package com.learning.core.day2session1;

public class D02P0503 {
	public static void main(String[] args) {
		String input = "abc";
		String output = "";
		System.out.println("Input: "+ input);
		System.out.println("Output: ");
		printSubsequences(input, output);
	}
	private static void printSubsequences(String input, String output) {
		if(input.length()==0) {
			if(!output.isEmpty()) {
				System.out.print(output +", ");
			}
			return;
		}
		char ch = input.charAt(0);
		String rem = input.substring(1);
		printSubsequences(rem, output);
		printSubsequences(rem, output + ch);
	}

}
