package com.learning.core.day1session1;

public class ArrayComputations {
    public static void performComputations(int[] array) {
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
        }
        array[15] = sum;
        array[16] = sum / 15;
        
        int min = array[0];
        for (int i = 1; i < array.length - 3; i++) { 
            if (array[i] < min) {
                min = array[i];
            }
        }
        array[17] = min;
    }
}