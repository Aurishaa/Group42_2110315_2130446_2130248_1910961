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

    public Supplier(String companyName, String contactPerson, String contactNumber, String name, Integer ID, String password, String email, String gender, LocalDate DOB) {
        super(name, ID, password, email, gender, DOB);
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

    @Override
    public String toString() {
        return "Supplier{" + "companyName=" + companyName + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + '}';
    }

    public void supplierInformation( String companyName, String contactPerson,String contactNumber){ 
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("SupplierInfo.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
             SupplierInformationTable newInformation = new SupplierInformationTable(companyName, contactPerson,  contactNumber);
             oos.writeObject(newInformation);
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




