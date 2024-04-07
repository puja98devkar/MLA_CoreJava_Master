package com.learning.core.day2session1;

public class D02P0506 {
	public static void main(String[] args) {
		String s= "aabcdaabc";
		System.out.println("Length of the longest prefix which is also a suffix: "+longestPrefixSuffix(s));
	}
private static int longestPrefixSuffix(String s) {
	int n = s.length();
	for (int len = n/2; len > 0; len--) {
		String prefix = s.substring(0, len);
		String suffix = s.substring(n - len);
		if (prefix.equals(suffix)) {
			return len;
		}
	}
	return 0;
}
}
