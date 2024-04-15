package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.*;
public class App 
{
	 public static void main(String[] args) {
	       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	       // Getting Beans from the Container
	       Battery battery = (Battery) context.getBean("batteryBean");
	       Disc disc = (Disc) context.getBean("discBean");
	       // Printing Product Details
	       battery.productDetails();
	       System.out.println("-----------------------------------");
	       disc.productDetails();
	       // Getting all bean names
	       String[] beanNames = context.getBeanDefinitionNames();
	       System.out.println("\nAll Beans Created by the Container:");
	       for (String beanName : beanNames) {
	           System.out.println(beanName);
	       }
	       // Close the context
	       ((ClassPathXmlApplicationContext) context).close();
	   }
}
