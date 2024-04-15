/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Cart implements Serializable {
    
    private List<Product> items;

    public Cart(List<Product> items) {
        this.items = items;
    }
    
    
    
   public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
 
}