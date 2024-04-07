package com.learning.core.day3session1;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;
 
    public Person(int id, String name, int age, double salary) {
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
return this.id;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
return id == person.id;
    }
 
    @Override
    public int compareTo(Person other) {
return Integer.compare(this.id, other.id);
    }
 
    public int getAge() {
        return age;
    }
}
 
public class D03P0705 {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>();
 
        // Predefined person details
        persons.add(new Person(1, "Alice", 22, 2500.0));
        persons.add(new Person(2, "Bob", 25, 3000.0));
        persons.add(new Person(3, "Charlie", 24, 4000.0));
        persons.add(new Person(4, "Diana", 29, 3500.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));
 
        // Print details of persons whose age is greater than 25
        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}