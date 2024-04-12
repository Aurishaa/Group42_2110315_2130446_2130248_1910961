/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;


import Supplier.SupplierInformationTable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Dell
 */
public class SupplyChainManager extends User implements Serializable{

    public SupplyChainManager(String name, Integer ID, String password, String email, LocalDate DOB, String Group) {
        super(name, ID, password, email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public static ObservableList<SupplierInformationTable> viewSuppliers(){
        ObservableList<SupplierInformationTable> supplierData = FXCollections.observableArrayList();
        SupplierInformationTable s;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("SupplierInformationTable.bin"));
            while (true) {
                s = (SupplierInformationTable) ois.readObject();
                System.out.println("The supplier Information you read: " + s.toString());
                supplierData.add(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(supplierData);
        return supplierData;
    }   
    }
    

