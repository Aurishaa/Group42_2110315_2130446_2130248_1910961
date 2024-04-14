/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Common.AppendableObjectOutputStream;

import Supplier.SupplierInformationTable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


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

   
    

 

  public static void supplierInformation( String companyName, String contactPerson,String contactNumber){ 
                   SupplierInformationTable supplierInfo = new SupplierInformationTable(companyName, contactPerson,  contactNumber);
  
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("SupplierInformationTable.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
             oos.writeObject(supplierInfo);
             System.out.println("Supplier information written successfully!");
             
             
         
      
         
         } 
        catch (IOException ex) {
             Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            
                if (oos != null) try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
                }
                
           
        }
    }
    
    }




