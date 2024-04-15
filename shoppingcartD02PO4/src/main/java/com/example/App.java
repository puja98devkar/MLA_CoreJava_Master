package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Get Shopping Cart instances for two customers
        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");

        // Add items to the shopping carts
        cart1.addItem(new Product("Product 1", 10.0));
        cart1.addItem(new Product("Product 2", 20.0));

        cart2.addItem(new Product("Product 3", 15.0));

        // Display items in each shopping cart
        System.out.println("Items in Cart 1:");
        for (Product item : cart1.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        System.out.println("\nItems in Cart 2:");
        for (Product item : cart2.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}
