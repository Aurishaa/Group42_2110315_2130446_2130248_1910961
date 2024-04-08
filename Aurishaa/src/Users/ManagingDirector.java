/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;



import Classes.Policy;
import Common.AppendableObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManagingDirector  extends User implements Serializable{

    public ManagingDirector(String name, Integer ID, String password, String email, LocalDate DOB, String Group) {
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

    public Integer getID() {
        return ID;
    }

    public LocalDate getDOB() {
        return DOB;
    }


  
     
    
    public void createPolicy( String policyTitle, String policyDetails,LocalDate policyEffectiveDate){ 
        
             Policy newPolicy = new Policy(policyTitle,  policyDetails,  policyEffectiveDate);
             File f = null;
             FileOutputStream fos = null;
             ObjectOutputStream oos = null;
            try {

            f = new File("Policy.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newPolicy);
            oos.close();
           

        } catch (IOException e) {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManagingDirector.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
    }

         
    }
                
}               
           
        
    
    
        
   
