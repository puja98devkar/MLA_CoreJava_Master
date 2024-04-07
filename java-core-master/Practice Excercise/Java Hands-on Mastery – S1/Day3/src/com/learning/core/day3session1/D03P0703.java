package com.learning.core.day3session1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
 
class Product {
    private String productId;
    private String productName;
    
    public Product(String productId, String productName) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) &&
                Objects.equals(productName, product.productName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(productId, productName);
    }
}
 
public class D03P0703 {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        
        products.add(new Product("P001", "Toyota Corolla"));
        products.add(new Product("P002", "Honda Civic"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Hyundai Elantra"));
        
        String inputProductId = "P003";
        String inputProductName = "Maruti Dezire";
        Product inputProduct = new Product(inputProductId, inputProductName);
        
        if (products.contains(inputProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}