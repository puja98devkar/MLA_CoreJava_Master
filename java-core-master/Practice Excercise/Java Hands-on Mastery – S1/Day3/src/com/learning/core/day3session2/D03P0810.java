package com.learning.core.day3session2;

import java.util.*;

class Employee1 {
    private int id;
    private String name;
    private String department;
    private String designation;
 
    public Employee1(int id, String name, String department, String designation) {
this.id = id;
this.name = name;
        this.department = department;
        this.designation = designation;
    }
 
    // Getters and Setters
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public String getDesignation() {
        return designation;
    }
 
    // Override toString method
    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }
 
    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee1 employee = (Employee1) obj;
return id == employee.id;
    }
}
 
public class D03P0810 {
    public static void main(String[] args) {
        // Create Hashtable to store Employee details with employee id as key
        Hashtable<Integer, Employee1> employeeTable = new Hashtable<>();
 
        // Add predefined employee details
        employeeTable.put(1001, new Employee1(1001, "John", "HR", "Manager"));
        employeeTable.put(1002, new Employee1(1002, "Alice", "IT", "Developer"));
        employeeTable.put(1003, new Employee1(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee1(1004, "Emily", "Marketing", "Marketing Manager"));
 
        // Input employee ID to search
        int searchId = 1003;
 
        // Search for the specific Employee
        if (employeeTable.containsKey(searchId)) {
            Employee1 foundEmployee = employeeTable.get(searchId);
            System.out.println(foundEmployee.toString());
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}