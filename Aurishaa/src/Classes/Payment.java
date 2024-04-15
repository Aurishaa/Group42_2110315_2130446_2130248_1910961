
package Classes;

import java.io.Serializable;


public class Payment implements Serializable{
    
     
     private String productName;
     private String quantities;
     private String unitPrice;
     private String totalPrice;

    

    public Payment( String productName, String quantities, String unitPrice, String totalPrice) {
        
        this.productName = productName;
        this.quantities = quantities;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    

   

    public String getProductName() {
        return productName;
    }

    public void setProductName(String producName) {
        this.productName = productName;
    }

    public String getQuantities() {
        return quantities;
    }

    public void setQuantities(String quantities) {
        this.quantities = quantities;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Payment{" + "productName=" + productName + ", quantities=" + quantities + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + '}';
    }

    
     
     
}
