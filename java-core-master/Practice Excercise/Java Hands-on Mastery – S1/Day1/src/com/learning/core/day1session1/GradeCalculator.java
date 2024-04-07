package com.learning.core.day1session1;

public class GradeCalculator {
    public static String calculateGrade(int percentage) {
        if (percentage >= 60) {
            return "A Grade";
        } else if (percentage >= 45) {
            return "B Grade";
        } else if (percentage >= 35) {
            return "C Grade";
        } else {
            return "Fail";
        }
    }
}