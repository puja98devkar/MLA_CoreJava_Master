package com.learning.core.day1session1;

public class TrianglePattern {
    public static String generatePattern(int height) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                pattern.append(i);
            }
            pattern.append("\n");
        }
        return pattern.toString();
    }
}