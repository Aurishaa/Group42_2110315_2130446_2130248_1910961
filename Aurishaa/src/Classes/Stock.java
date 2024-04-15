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
public class Stock implements Serializable{
    String productName;
    String unitPrice;
    String availability;

    public Stock(String productName, String unitPrice, String availability) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.availability = availability;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Stock{" + "productName=" + productName + ", unitPrice=" + unitPrice + ", availability=" + availability + '}';
    }
    
}
