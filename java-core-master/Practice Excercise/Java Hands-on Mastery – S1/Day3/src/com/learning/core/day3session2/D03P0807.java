package com.learning.core.day3session2;

import java.util.*;

class Car2 implements Comparable<Car2> {
    private String name;
    private double price;
 
    public Car2(String name, double price) {
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
        Car2 car = (Car2) obj;
        return Double.compare(car.price, price) == 0 &&
Objects.equals(name, car.name);
    }
 
    // Override compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car2 o) {
        return Double.compare(this.price, o.price);
    }
}
 
public class D03P0807 {
    public static void main(String[] args) {
        // Create TreeMap to store Car details
        TreeMap<Car2, String> carMap = new TreeMap<>();
 
        // Add predefined car details
        carMap.put(new Car2("Benz", 900000.0), "");
        carMap.put(new Car2("Audi", 600100.0), "");
        carMap.put(new Car2("Swift", 305000.0), "");
        carMap.put(new Car2("Bugatti", 80050.0), "");
 
        // Retrieve the key-value mapping associated with the greatest price
        Map.Entry<Car2, String> greatestEntry = carMap.lastEntry();
        System.out.println(greatestEntry.getKey());
 
        // Retrieve the key-value mapping associated with the least price
        Map.Entry<Car2, String> leastEntry = carMap.firstEntry();
        System.out.println(leastEntry.getKey());
    }
}