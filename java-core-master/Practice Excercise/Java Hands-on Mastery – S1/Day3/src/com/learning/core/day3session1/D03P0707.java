package com.learning.core.day3session1;

import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
    private int id;
    private String name;
    private int age;
    private double salary;
 
    public Person2(int id, String name, int age, double salary) {
this.id = id;
this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
        return name.toUpperCase();
    }
 
    @Override
    public int hashCode() {
        return id;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person = (Person2) o;
return id == person.id;
    }
 
    @Override
    public int compareTo(Person2 other) {
return Integer.compare(this.id, other.id);
    }
}
 
public class D03P0707 {
    public static void main(String[] args) {
        TreeSet<Person2> persons = new TreeSet<>();
 
        // Adding predefined information of persons
        persons.add(new Person2(1, "Jerry", 30, 999.0));
        persons.add(new Person2(2, "Smith", 28, 2999.0));
        persons.add(new Person2(3, "Popeye", 34, 5999.0));
        persons.add(new Person2(4, "Jones", 31, 6999.0));
        persons.add(new Person2(5, "John", 26, 1999.0));
        persons.add(new Person2(6, "Tom", 40, 3999.0));
 
        // Printing names of persons in uppercase
        for (Person2 person : persons) {
            System.out.print(person + " ");
        }
    }
}