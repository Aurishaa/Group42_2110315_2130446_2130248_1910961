/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Classes.Feedback;
import Classes.Product;
import Classes.ProductSample;
import Classes.SalesReport;
import Classes.Task;
import Common.AppendableObjectOutputStream;
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


public class Distributor extends User implements Serializable {
    

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

    public Distributor(String name, Integer ID, String password, String email, LocalDate DOB, String Group) {
        super(name, ID, password, email, DOB, Group);
    }

    public Integer getID() {
        return ID;
    }

    public LocalDate getDOB() {
        return DOB;
    }
    
    
     public static boolean addFeedBack(String Feedback,LocalDate dateOfFeedback){
        
        Feedback newFeedBack = new Feedback(
               Feedback,dateOfFeedback
                );
               
                
                
        System.out.println("FeedBack made:"+newFeedBack.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("FeedBack.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newFeedBack);
            oos.close();
            return true;
            
        } catch (IOException e) {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;
       
        }
     }
public static void requestProductSample(String productName, int quantity, String email, String number, String shippingAddress) {
    ProductSample newSample = new ProductSample(productName, quantity, number, shippingAddress);

    File f = new File("ProductSample.bin");
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    try {
        if (f.exists()) {
            fos = new FileOutputStream(f, true); 
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(newSample);
         System.out.println("Binary file written successfully");
    } catch (IOException e) {
        e.printStackTrace(); 
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
    
        
   
    
    public static ObservableList<Task> viewAssignedTask() {
    ObservableList<Task> taskList = FXCollections.observableArrayList();
    File file = new File("Task.bin");

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        while (true) {
            Task  newTask= (Task) ois.readObject();
            taskList.add(newTask);
        }
    } catch (EOFException e) {
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

    return taskList;
     
    }
  

public static void placeOrder(String productName, int quantity, float unitPrice, float totalPrice) {
    Product newProduct = new Product(
            productName, quantity, unitPrice, totalPrice
    );

    System.out.println("Order placed:" + newProduct.toString());

    File f = null;
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {

        f = new File("Product.bin");

        if (f.exists()) {
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);

        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(newProduct);
        oos.close();


    } catch (IOException e) {
        if (oos != null) {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Distributor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Error writing Object to binary file");


    }
}

 
    



    
    public static ObservableList<Product> returnProduct() {
    ObservableList<Product> productItem = FXCollections.observableArrayList();
    File file = new File("Product.bin");

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        while (true) {
            Product  newProduct= (Product) ois.readObject();
            productItem.add(newProduct);
        }
    } catch (EOFException e) {
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

    return productItem;

        
       
    
    }   
    
 public static void generateReport(String productName, int quantitySold) {
    SalesReport newReport = new SalesReport(
            productName, quantitySold
    );

    System.out.println("Report made:" + newReport.toString());

    File f = null;
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {

        f = new File("SalesReport.bin");

        if (f.exists()) {
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);

        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(newReport);
        oos.close();


    } catch (IOException e) {
        if (oos != null) {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Distributor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Error writing Object to binary file");

    }
    }
    
    
  public static ObservableList<Product> viewOrderHistoryPieChart() {
    ObservableList<Product> productView = FXCollections.observableArrayList();
    File file = new File("Product.bin");

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        while (true) {
            Product  newProduct= (Product) ois.readObject();
            productView.add(newProduct);
        }
    } catch (EOFException e) {
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

    return productView;

        
 
 
  }
  
  
  
}
    
    
    
    
    
    


