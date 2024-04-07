package com.learning.core.day1session1;

import java.util.ArrayList;
import java.util.List;
 
public class DistinctCombinations {
    public static List<String> findCombinations(String number, int length) {
        List<String> combinations = new ArrayList<>();
        combinationUtil(number, "", 0, length, combinations);
        return combinations;
    }
 
    private static void combinationUtil(String number, String curr, int index, int length, List<String> combinations) {
        if (length == 0) {
            combinations.add(curr);
            return;
        }
        for (int i = index; i <= number.length() - length; i++) {
            combinationUtil(number, curr + number.charAt(i), i + 1, length - 1, combinations);
        }
    }
}
