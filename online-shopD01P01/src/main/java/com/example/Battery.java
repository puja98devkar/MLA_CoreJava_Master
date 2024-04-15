package com.example;

public class Battery extends Product {
	   private boolean rechargeable;
	   // Constructors, getters, and setters
	   public Battery() {}
	   public Battery(int productId, String productName, double price, boolean rechargeable) {
	       super(productId, productName, price);
	       this.rechargeable = rechargeable;
	   }
	   public boolean isRechargeable() {
	       return rechargeable;
	   }
	   public void setRechargeable(boolean rechargeable) {
	       this.rechargeable = rechargeable;
	   }
	   @Override
	   public void productDetails() {
	       System.out.println("Battery Details:");
	       System.out.println("Product ID: " + getProductId());
	       System.out.println("Product Name: " + getProductName());
	       System.out.println("Price: $" + getPrice());
	       System.out.println("Rechargeable: " + isRechargeable());
	   }
	}