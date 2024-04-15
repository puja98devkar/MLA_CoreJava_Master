package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.Product;
import com.example.service.Cashier;
import com.example.service.ShoppingCart;


@Configuration
@ComponentScan(basePackages = "com.example")
public class App 
{
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        // Create products
        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setPrice(999.99);

        Product product2 = new Product();
        product2.setName("Headphones");
        product2.setPrice(49.99);

        // Create ShoppingCart
        ShoppingCart cart = context.getBean(ShoppingCart.class);

        // Add products to ShoppingCart
        cart.addItem(product1);
        cart.addItem(product2);

        // Checkout
        Cashier cashier = context.getBean(Cashier.class);
        try {
            cashier.checkout(cart);
            System.out.println("Checkout successful. Check the log file.");
        } catch (Exception e) {
            System.err.println("Error during checkout: " + e.getMessage());
        }

        // Close the context
        context.close();
    }

    @Bean
    public ShoppingCart shoppingCart() {
        return new ShoppingCart();
    }
}
