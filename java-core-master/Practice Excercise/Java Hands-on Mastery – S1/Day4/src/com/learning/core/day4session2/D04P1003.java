package com.learning.core.day4session2;
import java.util.Scanner;

public class D04P1003 {
    
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt(); 
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); 
        }
        
        System.out.println("Enter the target number to search for:");
        int target = scanner.nextInt(); 
        

        boolean found = linearSearch(arr, target);
        
        if (found) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present.");
        }
        
        scanner.close();
    }
}
