/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;


public class Cart implements Serializable {
 
    private String productName;
    private int quantity;
    private float unitPrice;
    private float totalPrice; 

    public Cart(String productName, int quantity, float unitPrice, float totalPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" + "productName=" + productName + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + '}';
    }
    
    
    public float findTotalPrice(){
       float total= this.quantity * this.unitPrice;
       return total;
    }
}
