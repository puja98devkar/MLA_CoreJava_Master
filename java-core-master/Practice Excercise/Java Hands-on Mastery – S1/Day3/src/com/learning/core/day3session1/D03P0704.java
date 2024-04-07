package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
class Product1 {
    private String productId;
    private String productName;
    
    public Product1(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    @Override
    public String toString() {
        return productId + " " + productName;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product1)) return false;
        Product1 product = (Product1) o;
        return productId.equals(product.productId);
    }
 
    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}

public class D03P0704 {
    public static void main(String[] args) {
        Set<Product1> products = new HashSet<>();
        
        products.add(new Product1("P001", "Maruti 800"));
        products.add(new Product1("P002", "Honda Civic"));
        products.add(new Product1("P003", "Maruti Dezire"));
        products.add(new Product1("P004", "Maruti Alto"));
        
        String removeProductId = "P002";

        products.removeIf(product -> product.getProductId().equals(removeProductId));

        for (Product1 product : products) {
            System.out.println(product);
        }
    }
}