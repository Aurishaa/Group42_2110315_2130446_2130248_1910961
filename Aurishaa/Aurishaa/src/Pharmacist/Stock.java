/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacist;

import java.io.Serializable;

public class Stock implements Serializable {
    private String productName;
    private String unitPrice;
    private String availability;

    public Stock(String productName, String unitPrice, String availability) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.availability = availability;
    }

    // Getters and setters for the fields
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
}
