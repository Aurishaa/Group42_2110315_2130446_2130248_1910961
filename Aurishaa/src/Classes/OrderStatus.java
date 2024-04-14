/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;


public class OrderStatus implements Serializable{
    public int deliveryId;
    public LocalDate deliveryDate;
    public int quantities;
    public String deliveryStatus;

    public OrderStatus() {
    }

    public OrderStatus(int deliveryId, LocalDate deliveryDate, int quantities, String deliveryStatus) {
        this.deliveryId = deliveryId;
        this.deliveryDate = deliveryDate;
        this.quantities = quantities;
        this.deliveryStatus = deliveryStatus;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "OrderStatus{" + "deliveryId=" + deliveryId + ", deliveryDate=" + deliveryDate + ", quantities=" + quantities + ", deliveryStatus=" + deliveryStatus + '}';
    }
    
    
}
