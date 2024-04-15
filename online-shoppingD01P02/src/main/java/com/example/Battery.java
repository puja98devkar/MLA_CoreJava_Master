package com.example;

public class Battery extends Product {
	   private boolean rechargeable;
	   // Parameterized Constructor
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
	public void productDetails() {
		// TODO Auto-generated method stub
		
	}
	 
	}