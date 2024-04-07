package com.learning.core.day3session1;

import java.util.TreeSet;

class Person4 implements Comparable<Person4> {
    private int id;
    private String name;
    private int age;
    private double salary;
 
    public Person4(int id, String name, int age, double salary) {
this.id = id;
this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }
 
    @Override
    public int hashCode() {
        return id;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person4 person = (Person4) o;
return id == person.id;
    }
 
    @Override
    public int compareTo(Person4 other) {
return Integer.compare(this.id, other.id);
    }
 
    public String getName() {
        return name;
    }
}
 
public class D03P0709 {
    public static void main(String[] args) {
        TreeSet<Person4> persons = new TreeSet<>();
 
        // Adding predefined information of persons
        persons.add(new Person4(1, "Jerry", 30, 999.0));
        persons.add(new Person4(2, "Smith", 28, 2999.0));
        persons.add(new Person4(3, "Popeye", 34, 5999.0));
        persons.add(new Person4(4, "Jones", 22, 6999.0));
        persons.add(new Person4(5, "John", 26, 1999.0));
        persons.add(new Person4(6, "Tom", 40, 3999.0));
 
        // Find and print the first person whose name starts with 'J'
        for (Person4 person : persons) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}