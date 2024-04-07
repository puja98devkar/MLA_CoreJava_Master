package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P0502 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		System.out.println("Enter number of last vowels to count: ");
		int n = scanner.nextInt();
		
		printLastNVowels(input, n);
	}
	private static void printLastNVowels(String str, int n) {
		String vowels = "aeiouAEIOU";
		StringBuilder lastNVowels = new StringBuilder();
		
		for (int i=str.length() - 1; i>=0;i--) {
			char ch = str.charAt(i);
			if(vowels.indexOf(ch) >= 0) {
				lastNVowels.insert(0, ch);
				n--;
				if(n == 0) {
					break;
				}
			}
		}
		if (n>0) {
			System.out.println("Mismatch in Vowel Count");
		}else {
			System.out.println("Last 'n' vowels:"+lastNVowels);
		}
	}

}
