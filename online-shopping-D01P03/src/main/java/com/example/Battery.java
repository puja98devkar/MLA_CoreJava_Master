package com.example;

public class Battery extends Product {
    private boolean rechargeable;

    public Battery(int id, String name, boolean rechargeable) {
        super(id, name);
        this.rechargeable = rechargeable;
    }

    // Getters and setters
}
