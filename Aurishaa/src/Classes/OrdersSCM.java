
package Classes;

import java.io.Serializable;


/**
 *
 * @author Dell
 */
public class OrdersSCM implements Serializable{
     private int orderNumber;
     private String product;
    private int quantity;

    public OrdersSCM() {
    }

    public OrdersSCM(int orderNumber, String product, int quantity) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.quantity = quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrdersSCM{" + "orderNumber=" + orderNumber + ", product=" + product + ", quantity=" + quantity + '}';
    }
    
}
