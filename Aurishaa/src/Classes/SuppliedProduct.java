/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Dell
 */
public class SuppliedProduct implements Serializable {
    private String productName;
    private int quantity;
    private LocalDate supplyDate;
    private String productType;

    public SuppliedProduct() {
    }

    public SuppliedProduct(String productName, int quantity, LocalDate supplyDate, String productType) {
        this.productName = productName;
        this.quantity = quantity;
        this.supplyDate = supplyDate;
        this.productType = productType;
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

    public LocalDate getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(LocalDate supplyDate) {
        this.supplyDate = supplyDate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "SuppliedProduct{" + "productName=" + productName + ", quantity=" + quantity + ", supplyDate=" + supplyDate + ", productType=" + productType + '}';
    }
    
    
}
