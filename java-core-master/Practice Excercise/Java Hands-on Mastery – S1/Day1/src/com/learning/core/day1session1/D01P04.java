package com.learning.core.day1session1;

import java.util.List;
//import java.util.Scanner;
 
public class D01P04 {
    public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);
        
        int[] numbers = {3,29,7,30,25,5,19,17,8,9,17,3,8,39};
        System.out.println(BingoGame.checkBingo(numbers, 3, 29));
        
        int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
        ArrayComputations.performComputations(A);
        System.out.println("Sum: " + A[15] + ", Avg: " + A[16] + ", Min: " + A[17]);

        int[] arr = {7,10,5,3,4,3,5,6};
        System.out.println("First Repeating Index: " + FirstRepeatingIndex.findFirstRepeating(arr));

        List<String> combinations = DistinctCombinations.findCombinations("123", 2);
        System.out.println("Combinations: " + combinations);
    }
}