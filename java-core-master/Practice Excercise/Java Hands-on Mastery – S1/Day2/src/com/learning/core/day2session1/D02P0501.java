package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P0501 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		System.out.println("Length of the string: "+input.length());
		String upperCaseInput = 
				input.toUpperCase();
		System.out.println("Uppercase: "+upperCaseInput);
		if(isPalindrome(input)) {
			System.out.println("It is a Palindrome. ");
		}
		else {
			System.out.println("It is not a Palindrome. ");
		}
	}
	private static boolean isPalindrome(String str) {
		String cleanStr = str.toLowerCase();
		int left = 0;
		int right = cleanStr.length() - 1;
		while(left < right) {
			if(cleanStr.charAt(left) != cleanStr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
