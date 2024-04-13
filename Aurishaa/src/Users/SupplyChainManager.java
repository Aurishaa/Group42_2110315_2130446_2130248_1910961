/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;


<<<<<<< Updated upstream
import Classes.Policy;
import Common.AppendableObjectOutputStream;
import Supplier.SupplierInformationTable;
import SupplyChainManager.Budget;
=======
import Classes.Budget;
import Classes.SupplierInformationTable;
import Common.AppendableObjectOutputStream;
import java.io.EOFException;

>>>>>>> Stashed changes
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

    public static ObservableList<SupplierInformationTable> viewSuppliers() {
    ObservableList<SupplierInformationTable> supplierInfo = FXCollections.observableArrayList();
    File file = new File("SupplierInformationTable.bin");

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        while (true) {
            SupplierInformationTable supplierInformationTable = (SupplierInformationTable) ois.readObject();
            supplierInfo.add(supplierInformationTable);
        }
    } catch (EOFException e) {
        // Reached end of file, do nothing
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace(); // Handle or log the exception
    }

    return supplierInfo;
}

    
    
    public static void requestBudget( String department, int amount,LocalDate requestDate){ 
        
             Budget newBudget = new Budget(department,  amount,  requestDate);
             File f = null;
             FileOutputStream fos = null;
             ObjectOutputStream oos = null;
            try {

            f = new File("Budget.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newBudget);
            oos.close();
           

        } catch (IOException e) {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(SupplyChainManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
    }

         
    }
    }
    

