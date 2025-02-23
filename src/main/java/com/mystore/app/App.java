package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        // Create the Spring context and load the AppConfig configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Product beans from the Spring context
        Product p1 = context.getBean("tumblerProduct", Product.class);
        Product p2 = context.getBean("bucketProduct", Product.class);

        // Display the Product objects
        System.out.println(p1);
        System.out.println(p2);
    }
}
