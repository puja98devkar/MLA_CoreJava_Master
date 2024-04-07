package com.learning.core.day3session2;

import java.util.*;

class Car3 implements Comparable<Car3> {
    private String name;
    private double price;
 
    public Car3(String name, double price) {
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
        Car3 car = (Car3) obj;
        return Double.compare(car.price, price) == 0 &&
Objects.equals(name, car.name);
    }
 
    // Override compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car3 o) {
        return Double.compare(this.price, o.price);
    }
}
 
public class D03P0808 {
    public static void main(String[] args) {
        // Create TreeMap to store Car details
        TreeMap<Car3, String> carMap = new TreeMap<>();
 
        // Add predefined car details
        carMap.put(new Car3("Benz", 900000.0), "");
        carMap.put(new Car3("Audi", 600100.0), "");
        carMap.put(new Car3("Swift", 305000.0), "");
        carMap.put(new Car3("Bugatti", 80050.0), "");
 
        // Retrieve and remove the key-value mapping associated with the greatest key
        Map.Entry<Car3, String> greatestEntry = carMap.pollLastEntry();
        System.out.println(greatestEntry.getKey());
 
        // Replace the value mapped by the specified key with the new value
        double keyToReplace = 80050.0;
        for (Map.Entry<Car3, String> entry : carMap.entrySet()) {
            if (entry.getKey().getPrice() == keyToReplace) {
                entry.setValue("Reva");
            }
        }
 
        // Print the updated TreeMap
        for (Map.Entry<Car3, String> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}