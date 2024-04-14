/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacist;
import java.io.Serializable;

public class DummyMedicine implements Serializable {

    private final String medicineName;
    private final String components;

    public DummyMedicine(String medicineName, String components) {
        this.medicineName = medicineName;
        this.components = components;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getComponents() {
        return components;
    }
}

