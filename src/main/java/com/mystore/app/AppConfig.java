package com.mystore.app;

import org.springframework.context.annotation.Bean;
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
        return product;
    }
}
