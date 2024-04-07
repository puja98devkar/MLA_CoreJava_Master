package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03 {
private static final Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Month Name");
            System.out.println("2. Weekday Name");
            System.out.println("3. Grade Calculator");
            System.out.println("4. Triangle Pattern");
            System.out.println("5. Factorial Calculator");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
 
            switch (choice) {
                case 1:
                    System.out.print("Enter month number: ");
                    int month = scanner.nextInt();
                    System.out.println(MonthName.getMonthName(month));
                    break;
                case 2:
                    System.out.print("Enter weekday number: ");
                    int day = scanner.nextInt();
                    System.out.println(WeekdayName.getWeekdayName(day));
                    break;
                case 3:
                    System.out.print("Enter percentage: ");
                    int percentage = scanner.nextInt();
                    System.out.println(GradeCalculator.calculateGrade(percentage));
                    break;
                case 4:
                    System.out.print("Enter height of triangle: ");
                    int height = scanner.nextInt();
                    System.out.println(TrianglePattern.generatePattern(height));
                    break;
                case 5:
                    System.out.print("Enter number for factorial calculation: ");
                    int number = scanner.nextInt();
                    System.out.println("Factorial of " + number + " is " + FactorialCalculator.calculateFactorial(number));
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }
    }
}