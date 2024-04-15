package com.mphasis;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
   public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
       shoppingCart.getitems();
       shoppingCart.additem();
       shoppingCart.removeitem();
       shoppingCart.updateItem();
       context.close();
   }
}