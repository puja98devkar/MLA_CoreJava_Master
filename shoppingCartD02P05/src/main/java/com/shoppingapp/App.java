package com.shoppingapp;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Cashier bean from the Spring container
        Cashier cashier = context.getBean("cashierBean", Cashier.class);

        // Create a sample shopping cart
        ShoppingCart cart = new ShoppingCart(Arrays.asList("Item1", "Item2", "Item3"));

        try {
            // Perform checkout
            cashier.checkout(cart);
            System.out.println("Checkout completed. Check the log file for details.");
        } catch (IOException e) {
            System.err.println("Error during checkout: " + e.getMessage());
        } finally {
            try {
                // Close the file and release resources
                cashier.closeFile();
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
            // Close the Spring context
            context.close();
        }
    }
}
