package com.learning.core.day3session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class D03P0701 {
    public static void main(String[] args) {
        // List of student names
        List<String> studentNames = new ArrayList<>(Arrays.asList("Jack", "Paul", "Henry", "Mary", "Ronaldo"));
 
        // Name to search for
        String searchName = "Henry";
 
        // Search for the name in the list
        if (studentNames.contains(searchName)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}