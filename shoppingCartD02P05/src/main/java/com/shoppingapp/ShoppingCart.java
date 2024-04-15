package com.shoppingapp;

import java.util.List;

public class ShoppingCart {
    private List<String> items;

    public ShoppingCart(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}
