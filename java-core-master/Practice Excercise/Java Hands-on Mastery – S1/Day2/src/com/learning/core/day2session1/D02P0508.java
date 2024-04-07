package com.learning.core.day2session1;

public class D02P0508 {
	public static void main(String[] args) {
		String input = "Helloworld";
		System.out.println("Can the string be split into four distinct strings?"+ (canBeSplitIntoFourDistinctStrings(input)?
				"Yes" : "No"));
	}

	private static boolean canBeSplitIntoFourDistinctStrings(String str) {
		boolean[] exist = new boolean[256];
		int distinctCount = 0;
		
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!exist[c]) {
				distinctCount++;
				exist[c]=true;
			}
			if(distinctCount >= 4) {
				return true;
			}
		}
		return false;
	}
}
