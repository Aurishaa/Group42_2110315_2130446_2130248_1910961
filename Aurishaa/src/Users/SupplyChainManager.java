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
        super(name, ID, password, email, DOB, Group);
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

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public static void viewSuppliers(String companyName, String contactPerson,String contactNumber){
        ObservableList<SupplierInformationTable> supplierData = FXCollections.observableArrayList();
    }
        Bill i;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("BillObjects.bin"));
            while (true) {
                i = (Bill) ois.readObject();
                System.out.println("The Bill u read: " + i.toString());
                billList.add(i);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(billList);
        return billList;
        
    }
    

