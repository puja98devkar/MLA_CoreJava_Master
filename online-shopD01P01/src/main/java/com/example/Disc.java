package com.example;

public class Disc extends Product {
	   private int capacity;
	   // Constructors, getters, and setters
	   public Disc() {}
	   public Disc(int productId, String productName, double price, int capacity) {
	       super(productId, productName, price);
	       this.capacity = capacity;
	   }
	   public int getCapacity() {
	       return capacity;
	   }
	   public void setCapacity(int capacity) {
	       this.capacity = capacity;
	   }
	   @Override
	   public void productDetails() {
	       System.out.println("Disc Details:");
	       System.out.println("Product ID: " + getProductId());
	       System.out.println("Product Name: " + getProductName());
	       System.out.println("Price: $" + getPrice());
	       System.out.println("Capacity: " + getCapacity() + " GB");
	   }
	}