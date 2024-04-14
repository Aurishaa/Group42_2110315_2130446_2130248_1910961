/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Classes.Budget;
import Classes.NewlyAddedProduct;
import Classes.OrderStatus;
import Classes.OrdersSCM;
import Classes.SuppliedProduct;
import Common.AppendableObjectOutputStream;
import Classes.SupplierInformationTable;
import Classes.Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Supplier extends User implements Serializable{
    
    public String companyName;
    public String contactPerson;
    public String contactNumber;

    public Supplier(String companyName, String contactPerson, String contactNumber, String name, Integer ID, String password, String email, LocalDate DOB, String Group) {
        super(name, ID, password, email, DOB, Group);
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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

    public Integer getID() {
        return ID;
    }

    public LocalDate getDOB() {
        return DOB;
    }

   
   public static void supplierInformation(String companyName, String contactPerson, String contactNumber) {
    SupplierInformationTable newSupplierInformationTable = new SupplierInformationTable(companyName, contactPerson, contactNumber);
    File f = new File("SupplierInformationTable.bin");
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    try {
        if (f.exists()) {
            fos = new FileOutputStream(f, true); // Append mode
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(newSupplierInformationTable);
    } catch (IOException e) {
        e.printStackTrace(); // Handle or log the exception
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace(); // Handle or log the exception
        }
    }
  } 

 
 public static void suppliedProduct(String productName, int quantity, LocalDate supplyDate,String productType) {
    SuppliedProduct suppliedProduct = new SuppliedProduct(productName, quantity, supplyDate,productType);
    File f = new File("SuppliedProduct.bin");
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    try {
        if (f.exists()) {
            fos = new FileOutputStream(f, true); // Append mode
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(suppliedProduct);
    } catch (IOException e) {
        e.printStackTrace(); // Handle or log the exception
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace(); // Handle or log the exception
        }
    }
    
    
  
             
}

 public static ObservableList<OrdersSCM> viewIncomingOrders(){
        ObservableList<OrdersSCM> OrderInfo = FXCollections.observableArrayList();
        OrdersSCM o;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("OrdersSCM.bin"));
            while (true) {
                o = (OrdersSCM) ois.readObject();
                System.out.println("The orders you read: " + o.toString());
                OrderInfo.add(o);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(OrderInfo);
        return OrderInfo;
    } 
public static ObservableList<Task> viewTask(){
        ObservableList<Task> TaskInfo = FXCollections.observableArrayList();
        Task t;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Task.bin"));
            while (true) {
                t = (Task) ois.readObject();
                System.out.println("The tasks you read: " + t.toString());
                TaskInfo.add(t);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(TaskInfo);
        return TaskInfo;
    } 


public static ObservableList<NewlyAddedProduct> viewNewProduct(){
        ObservableList<NewlyAddedProduct> productInfo = FXCollections.observableArrayList();
        NewlyAddedProduct n;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("NewlyaddedProduct.bin"));
            while (true) {
                n = (NewlyAddedProduct) ois.readObject();
                System.out.println("The new products are: " + n.toString());
                productInfo.add(n);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(productInfo);
        return productInfo;
    } 


public static void orderStatus(int deliveryId, LocalDate deliveryDate, int quantities, String deliveryStatus) {
    OrderStatus newOrderStatus = new OrderStatus(deliveryId, deliveryDate, quantities,deliveryStatus);
    File f = new File("OrderStatus.bin");
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    try {
        if (f.exists()) {
            fos = new FileOutputStream(f, true); // Append mode
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(newOrderStatus);
    } catch (IOException e) {
        e.printStackTrace(); // Handle or log the exception
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace(); // Handle or log the exception
        }
    }
  } 
}




