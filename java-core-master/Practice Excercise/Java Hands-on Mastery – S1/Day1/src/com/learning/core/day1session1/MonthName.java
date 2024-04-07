package com.learning.core.day1session1;

public class MonthName {
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
        	"August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12) {
            return months[month - 1];
        } else {
            return "Invalid Input";
        }
    }
}