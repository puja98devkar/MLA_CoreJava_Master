package com.learning.core.day1session1;

public class BingoGame {
    public static String checkBingo(int[] array, int num1, int num2) {
        boolean foundNum1 = false, foundNum2 = false;
        for (int j : array) {
            if (j == num1) foundNum1 = true;
            if (j == num2) foundNum2 = true;
        }
        if (foundNum1 && foundNum2) {
            return "It's Bingo";
        } else {
            return "Not Found";
        }
    }
}
