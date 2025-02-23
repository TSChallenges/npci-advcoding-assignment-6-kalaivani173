package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        // Create the Spring context and load the AppConfig configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

<<<<<<< HEAD
        // Retrieve the Product bean from the Spring context
        Product p1 = context.getBean(Product.class);
        p1.setId(1);
        p1.setName("Tumbler");
        p1.setBarcode();
        System.out.println(p1);

        // Retrieve the Product bean again for a different product
        Product p2 = context.getBean(Product.class);
        p2.setId(2);
        p2.setName("Bucket");
        p2.setBarcode();
=======
        // Retrieve the Product beans from the Spring context
        Product p1 = context.getBean("tumblerProduct", Product.class);
        Product p2 = context.getBean("bucketProduct", Product.class);

        // Display the Product objects
        System.out.println(p1);
>>>>>>> b7efc72e26df058e1f16ebecd4094e41cb095a09
        System.out.println(p2);
    }
}
