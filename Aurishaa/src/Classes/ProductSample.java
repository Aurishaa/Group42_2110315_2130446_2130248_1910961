/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class ProductSample implements Serializable {
    String productName;
    int quantity;
    String number;
    String shippingAddress;

    public ProductSample(String productName, int quantity, String number, String shippingAddress) {
        this.productName = productName;
        this.quantity = quantity;
        this.number = number;
        this.shippingAddress = shippingAddress;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "ProductSample{" + "productName=" + productName + ", quantity=" + quantity + ", number=" + number + ", shippingAddress=" + shippingAddress + '}';
    }
    
}
   