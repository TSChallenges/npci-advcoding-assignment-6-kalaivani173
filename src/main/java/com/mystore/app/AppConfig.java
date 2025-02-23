package com.mystore.app;

import org.springframework.context.annotation.Bean;
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
        return product;
    }
}
