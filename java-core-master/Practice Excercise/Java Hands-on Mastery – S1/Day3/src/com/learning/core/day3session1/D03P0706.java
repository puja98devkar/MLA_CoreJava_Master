package com.learning.core.day3session1;

import java.util.TreeSet;

class Person1 implements Comparable<Person1> {
    private int id;
    private String name;
    private int age;
    private double salary;
 
    // Constructor
    public Person1(int id, String name, int age, double salary) {
this.id = id;
this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
return id == person.id;
    }
 
    @Override
    public int hashCode() {
        return id;
    }
 
    // Natural sorting by id
    @Override
    public int compareTo(Person1 other) {
return Integer.compare(this.id, other.id);
    }
}
 
public class D03P0706 {
    public static void main(String[] args) {
        TreeSet<Person1> persons = new TreeSet<>();
 
        // Adding predefined information of persons
        persons.add(new Person1(1, "Jerry", 30, 999.0));
        persons.add(new Person1(2, "Smith", 28, 2999.0));
        persons.add(new Person1(3, "Popeye", 34, 5999.0));
        persons.add(new Person1(4, "Jones", 31, 6999.0));
        persons.add(new Person1(5, "John", 26, 1999.0));
        persons.add(new Person1(6, "Tom", 40, 3999.0));
 
        // Printing the id, name, and salary of each person
        for (Person1 person : persons) {
            System.out.println(person);
        }
    }
}