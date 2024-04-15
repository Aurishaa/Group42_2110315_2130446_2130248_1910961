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
    
    public String deliveryStatus;

    public OrderStatus() {
    }

    public OrderStatus(int deliveryId, LocalDate deliveryDate, String deliveryStatus) {
        this.deliveryId = deliveryId;
        this.deliveryDate = deliveryDate;
        
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

   

    

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "OrderStatus{" + "deliveryId=" + deliveryId + ", deliveryDate=" + deliveryDate + ", deliveryStatus=" + deliveryStatus + '}';
    }
    
    
}

