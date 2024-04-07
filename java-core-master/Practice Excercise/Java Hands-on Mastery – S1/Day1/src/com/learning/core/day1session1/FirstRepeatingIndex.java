package com.learning.core.day1session1;

import java.util.HashSet;

public class FirstRepeatingIndex {
    public static int findFirstRepeating(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int minIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (set.contains(array[i])) {
                minIndex = i;
            } else {
                set.add(array[i]);
            }
        }
        return minIndex;
    }
}
