package com.mphasis;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
   public void getitems() {
       System.out.println("Getting items from the shopping cart...");
   }
   public void additem() {
       System.out.println("Adding item to the shopping cart...");
   }
   public void removeitem() {
       System.out.println("Removing item from the shopping cart...");
   }
   public void updateItem() {
       System.out.println("Updating item in the shopping cart...");
   }
}