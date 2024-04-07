package com.learning.core.day3session2;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;
 
    public Employee(int id, String name, String department, String designation) {
this.id = id;
this.name = name;
        this.department = department;
        this.designation = designation;
    }
 
    // Getters and Setters
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
this.name = name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
    public String getDesignation() {
        return designation;
    }
 
    public void setDesignation(String designation) {
        this.designation = designation;
    }
 
    // Override toString method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
 
    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, designation);
    }
 
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
return id == employee.id &&
Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department) &&
                Objects.equals(designation, employee.designation);
    }
}
 
public class D03P0809 {
    public static void main(String[] args) {
        // Create Hashtable to store Employee details with employee id as key
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
 
        // Add predefined employee details
        employeeTable.put(101, new Employee(101, "John", "HR", "Manager"));
        employeeTable.put(102, new Employee(102, "Alice", "IT", "Developer"));
        employeeTable.put(103, new Employee(103, "Bob", "Finance", "Accountant"));
        employeeTable.put(104, new Employee(104, "Emily", "Marketing", "Marketing Manager"));
 
        // Verify whether the Hashtable is empty or not
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println(isEmpty);
    }
}