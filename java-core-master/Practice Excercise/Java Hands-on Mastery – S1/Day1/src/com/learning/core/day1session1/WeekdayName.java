package com.learning.core.day1session1;

public class WeekdayName {
    public static String getWeekdayName(int day) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day >= 1 && day <= 7) {
            return weekdays[day - 1];
        } else {
            return "Invalid Input";
        }
    }
}