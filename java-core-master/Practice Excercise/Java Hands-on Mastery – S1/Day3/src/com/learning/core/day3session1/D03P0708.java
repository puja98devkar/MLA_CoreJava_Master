package com.learning.core.day3session1;

import java.util.TreeSet;

class Person3 implements Comparable<Person3> {
    private int id;
    private String name;
    private int age;
    private double salary;
 
    public Person3(int id, String name, int age, double salary) {
this.id = id;
this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    public double getSalary() {
        return salary;
    }
 
    @Override
    public String toString() {
        return "Id=" + id + ", Name=" + name + ", Age=" + age + ", Salary=" + salary;
    }
 
    @Override
    public int hashCode() {
        return id;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person = (Person3) o;
return id == person.id;
    }
 
    @Override
    public int compareTo(Person3 other) {
return Integer.compare(this.id, other.id);
    }
}
 
public class D03P0708 {
    public static void main(String[] args) {
        TreeSet<Person3> persons = new TreeSet<>();
 
        // Adding predefined information of persons
        persons.add(new Person3(1, "Jerry", 30, 999.0));
        persons.add(new Person3(2, "Smith", 28, 2999.0));
        persons.add(new Person3(3, "Popeye", 34, 5999.0));
        persons.add(new Person3(4, "Jones", 31, 6999.0));
        persons.add(new Person3(5, "John", 26, 1999.0));
        persons.add(new Person3(6, "Tom", 40, 3999.0));
 
        // Calculating the sum of all salaries
        double sumOfSalaries = persons.stream().mapToDouble(Person3::getSalary).sum();
 
        System.out.println(sumOfSalaries);
    }
}
