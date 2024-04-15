/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class NewlyAddedProduct implements Serializable {
    private int productId;
    private String name;
    private String description;
    private int quantity;
    private String productType;

    public NewlyAddedProduct(int productId, String name, String description, int quantity, String productType) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.productType = productType;
    }

    public NewlyAddedProduct() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "NewlyAddedProduct{" + "productId=" + productId + ", name=" + name + ", description=" + description + ", quantity=" + quantity + ", productType=" + productType + '}';
    }

}
