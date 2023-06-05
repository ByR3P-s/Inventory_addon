    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket_system_pydev.model;

import java.util.HashMap;

public class Inventory {
    
    private HashMap<String, Product> products = new HashMap<>();
    private Product product;
    

    public Inventory() {
        products = new HashMap<>();
    }
    
    public void addProduct() {
        Product product1 = new Product("0001", "Cookies Wafer", 1.5);
        Product product2 = new Product("0002", "Lemon Juice", 25);
        Product product3 = new Product("0003", "Bread", 0.5);
        
        products.put(product1.getBarcode(),product1);
        products.put(product2.getBarcode(),product2);
        products.put(product3.getBarcode(),product3);
    }
    
     public Product verifyProduct(String barcode){
        return products.get(barcode);
     }

}
