package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }
}
