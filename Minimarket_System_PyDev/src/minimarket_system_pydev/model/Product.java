/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket_system_pydev.model;

public class Product {
    private String productName;
    private double price;
    private String barcode;

    public Product() {
    }
    

    public Product(String barcode , String productName, double price) {
        this.barcode = barcode;
        this.productName = productName;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }
    
    public String getProductName() {
        return productName;
    }


    public double getPrice() {
        return price;
    }


    
}
