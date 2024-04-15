package com.example;

public abstract class Product {
	   private int productId;
	   private String productName;
	   private double price;
	   // Constructors, getters, and setters
	   public Product() {}
	   public Product(int productId, String productName, double price) {
	       this.productId = productId;
	       this.productName = productName;
	       this.price = price;
	   }
	   public int getProductId() {
	       return productId;
	   }
	   public void setProductId(int productId) {
	       this.productId = productId;
	   }
	   public String getProductName() {
	       return productName;
	   }
	   public void setProductName(String productName) {
	       this.productName = productName;
	   }
	   public double getPrice() {
	       return price;
	   }
	   public void setPrice(double price) {
	       this.price = price;
	   }
	   // Abstract method
	   public abstract void productDetails();
	}
	