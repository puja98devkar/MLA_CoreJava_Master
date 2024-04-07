package com.learning.core.day3session2;

import java.util.Hashtable;
class Employee2 {
   private int id;
   private String name;
   private String department;
   private String designation;
   public Employee2(int id, String name, String department, String designation) {
this.id = id;
       this.name = name;
       this.department = department;
       this.designation = designation;
   }
   // Override toString() to print employee details
   @Override
   public String toString() {
       return id + " " + name + " " + designation + " " + department;
   }
   // Override hashCode() and equals() for Hashtable operations
   @Override
   public int hashCode() {
       return id;
   }
   @Override
   public boolean equals(Object obj) {
       if (this == obj) {
           return true;
       }
       if (obj == null || getClass() != obj.getClass()) {
           return false;
       }
       Employee2 employee = (Employee2) obj;
       return id == employee.id;
   }
}
public class D03P0811 {
   public static void main(String[] args) {
       // Create a Hashtable to store Employee objects
       Hashtable<Integer, Employee2> employeeTable = new Hashtable<>();
       // Adding 4 Employee objects with predefined information
       Employee2 emp1 = new Employee2(1001, "Daniel", "L&D", "Analyst");
       Employee2 emp2 = new Employee2(1002, "Thomas", "Testing", "Tester");
       Employee2 emp3 = new Employee2(1003, "Robert", "Development", "Product Manager");
       Employee2 emp4 = new Employee2(1004, "Grace", "HR", "Tech Support");
       // Storing Employee objects in Hashtable with id as key
       employeeTable.put(emp1.hashCode(), emp1);
       employeeTable.put(emp2.hashCode(), emp2);
       employeeTable.put(emp3.hashCode(), emp3);
       employeeTable.put(emp4.hashCode(), emp4);
       // Add a new Employee if not exists
       int newId = 1005;
       if (!employeeTable.containsKey(newId)) {
           Employee2 newEmp = new Employee2(1005, "Charles", "Testing", "QA Lead");
           employeeTable.put(newEmp.hashCode(), newEmp);
       }
       // Display Employee information
       for (Employee2 emp : employeeTable.values()) {
           System.out.println(emp);
       }
   }
}