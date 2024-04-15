package com.mphasis;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
   @Before("execution(* com.mphasis.ShoppingCart.getitems())")
   public void logGetItems() {
       System.out.println("Logging - Before: Executing getitems()");
   }
   @Before("execution(* com.mphasis.ShoppingCart.additem(..))")
   public void logAddItem() {
       System.out.println("Logging - Before: Executing additem()");
   }
   @Before("execution(* com.mphasis.ShoppingCart.removeitem(..))")
   public void logRemoveItem() {
       System.out.println("Logging - Before: Executing removeitem()");
   }
   @Before("execution(* com.mphasis.ShoppingCart.updateItem(..))")
   public void logUpdateItem() {
       System.out.println("Logging - Before: Executing updateItem()");
   }
}