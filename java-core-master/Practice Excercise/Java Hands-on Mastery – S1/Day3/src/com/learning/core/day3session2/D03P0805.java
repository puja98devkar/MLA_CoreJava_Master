package com.learning.core.day3session2;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;
 
    public Car(String name, double price) {
this.name = name;
        this.price = price;
    }
 
    // Getters and Setters
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    // Override toString method
    @Override
    public String toString() {
        return name + " " + price;
    }
 
    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
 
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
Objects.equals(name, car.name);
    }
 
    // Override compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car o) {
        return Double.compare(this.price, o.price);
    }
}
 
public class D03P0805 {
    public static void main(String[] args) {
        // Create TreeMap to store Car details
        TreeMap<Car, String> carMap = new TreeMap<>();
 
        // Add predefined car details
        carMap.put(new Car("Bugatti", 80050.0), "");
        carMap.put(new Car("Swift", 305000.0), "");
        carMap.put(new Car("Audi", 600100.0), "");
        carMap.put(new Car("Benz", 900000.0), "");
 
        // Retrieve all car details
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}