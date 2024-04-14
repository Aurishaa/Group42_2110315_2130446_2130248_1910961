/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Users.Distributor;
import Classes.Budget;
import Classes.NewlyAddedProduct;
import Classes.OrderStatus;

import Classes.OrdersSCM;
import Classes.ProductSample;
import Classes.SuppliedProduct;
import Common.AppendableObjectOutputStream;
import Classes.SupplierInformationTable;
import java.io.EOFException;
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

    

    public static ObservableList<SupplierInformationTable> viewSuppliers(){
        ObservableList<SupplierInformationTable> supplierInfo = FXCollections.observableArrayList();
        SupplierInformationTable s;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("SupplierInformationTable.bin"));
            while (true) {
                s = (SupplierInformationTable) ois.readObject();
                System.out.println("The supplier Information you read: " + s.toString());
                supplierInfo.add(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(supplierInfo);
        return supplierInfo;
    } 
    
  public static void requestBudget(String department, int amount, LocalDate requestDate) {
    Budget newBudget = new Budget(department, amount, requestDate);
    File f = new File("Budget.bin");
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

        oos.writeObject(newBudget);
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
  
  public static ObservableList<ProductSample> approveProduct() {
    ObservableList<ProductSample> productInfo = FXCollections.observableArrayList();
    ProductSample p;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("ProductSample.bin"));
            while (true) {
                p = (ProductSample) ois.readObject();
                System.out.println("The supplier Information you read: " + p.toString());
                productInfo.add(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(productInfo);
        return productInfo;
    } 
  
  
  public static ObservableList<SuppliedProduct> updateInventory() {
    ObservableList<SuppliedProduct> suppliedProductInfo = FXCollections.observableArrayList();
    SuppliedProduct sp;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("SuppliedProduct.bin"));
            while (true) {
                sp = (SuppliedProduct) ois.readObject();
                System.out.println("The supplied product information you read: " + sp.toString());
                suppliedProductInfo.add(sp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(suppliedProductInfo);
        return suppliedProductInfo;
    } 
  
  public static void provideOrders(int orderNumber, String product, int quantity) {
    OrdersSCM newOrdersSCM = new OrdersSCM(orderNumber, product, quantity);
    File f = new File("OrdersSCM.bin");
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

        oos.writeObject(newOrdersSCM);
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
  
  
  public static void addedProduct(int productId, String name, String description, int quantity, String productType) {
    NewlyAddedProduct newAddedProduct = new NewlyAddedProduct(productId, name, description,quantity,productType);
    File f = new File("NewlyAddedProduct.bin");
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

        oos.writeObject(newAddedProduct);
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
  public static ObservableList<OrderStatus> viewStatus() {
    ObservableList<OrderStatus> statusInfo = FXCollections.observableArrayList();
    OrderStatus o;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("OrderStatus.bin"));
            while (true) {
                o = (OrderStatus) ois.readObject();
                System.out.println("The order status information you read: " + o.toString());
                statusInfo.add(o);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(statusInfo);
        return statusInfo;
    } 
}

