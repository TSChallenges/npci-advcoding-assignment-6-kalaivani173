package com.mystore.app;

<<<<<<< HEAD
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
=======
class Product {

    private int id;
    private String name;

    public Product() {
>>>>>>> b7efc72e26df058e1f16ebecd4094e41cb095a09
        System.out.println("In Product constructor");
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public String getBarcode() {
        return barcode;
    }

=======
>>>>>>> b7efc72e26df058e1f16ebecd4094e41cb095a09
    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public void setBarcode() {
        this.barcode = barcodeGenerator.createBarcode(this);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', barcode='" + barcode + "'}";
=======
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
>>>>>>> b7efc72e26df058e1f16ebecd4094e41cb095a09
    }
}
