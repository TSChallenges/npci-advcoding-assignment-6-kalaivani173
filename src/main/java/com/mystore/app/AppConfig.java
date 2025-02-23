package com.mystore.app;

import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mystore.app")  // Enable component scanning in the specified package
public class AppConfig {

    // Define the Product bean manually if needed, but it's already autowired via @Component
    @Bean
    public Product product(Barcode barcode) {
        Product product = new Product(barcode);
        product.setId(1);  // Example to initialize
        product.setName("Example Product");
=======
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define the first Product bean with the name "Tumbler"
    @Bean
    public Product tumblerProduct() {
        Product product = new Product();
        product.setId(1);
        product.setName("Tumbler");
        return product;
    }

    // Define the second Product bean with the name "Bucket"
    @Bean
    public Product bucketProduct() {
        Product product = new Product();
        product.setId(2);
        product.setName("Bucket");
>>>>>>> b7efc72e26df058e1f16ebecd4094e41cb095a09
        return product;
    }
}
