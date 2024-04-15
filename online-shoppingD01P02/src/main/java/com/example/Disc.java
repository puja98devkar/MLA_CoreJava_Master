package com.example;


public class Disc extends Product {

    private int capacity;

    // Parameterized Constructor

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

	

	public void productDetails() {
		// TODO Auto-generated method stub
		
	}
	
   
}