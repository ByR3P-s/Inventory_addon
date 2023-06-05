/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket_system_pydev.model;

public class Item {
    
    private Product product;
    private int amount;

    public Item(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
    
    public double calculateSubtotal() {
        return product.getPrice() * amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }    
        
}
