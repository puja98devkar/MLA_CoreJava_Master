package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App 
{
	 public static void main(String[] args) {
	  
	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	        // Get the beans from the Spring container
	        Battery battery = (Battery) context.getBean("battery");
	        Disc disc = (Disc) context.getBean("disc");

	        // Print out the beans
	        System.out.println(battery);
	        System.out.println(disc);
	    }
}
