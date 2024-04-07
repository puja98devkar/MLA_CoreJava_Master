package com.learning.core.day2session1;

public class D02P0504 {
	public static void main(String[] args) {
		String input = "aebcda";
		System.out.println("Minimum deletions to make palindrome: "+ findMinDeletions(input));
	}
	private static int findMinDeletions(String s)
	{
		int n = s.length();
		String rev = new
StringBuilder(s).reverse().toString();
		int lpsLength = longestCommonSubsequence(s, rev);
		return n - lpsLength;		
	}
	private static int longestCommonSubsequence(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp=new int[m+1][n+1];
		
		for (int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
		
	}

}
