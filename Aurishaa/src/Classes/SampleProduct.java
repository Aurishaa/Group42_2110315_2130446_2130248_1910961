/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class SampleProduct {
    private String productName;
    private int quantity;
    private String email;
    private int number;
    private String address;

    public SampleProduct(String productName, int quantity, String email, int number, String address) {
        this.productName = productName;
        this.quantity = quantity;
        this.email = email;
        this.number = number;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SampleProduct{" + "productName=" + productName + ", quantity=" + quantity + ", email=" + email + ", number=" + number + ", address=" + address + '}';
    }
    
    
}
