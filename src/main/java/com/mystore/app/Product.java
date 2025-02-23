package com.mystore.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {

    private int id;
    private String name;
    private String barcode;

    private Barcode barcodeGenerator;

    @Autowired  // Automatically inject the Barcode dependency
    public Product(Barcode barcodeGenerator) {
        this.barcodeGenerator = barcodeGenerator;
        System.out.println("In Product constructor");
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode() {
        this.barcode = barcodeGenerator.createBarcode(this);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', barcode='" + barcode + "'}";
    }
}
