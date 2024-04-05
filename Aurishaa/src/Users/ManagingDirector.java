/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;



import Common.AppendableObjectOutputStream;
import ManagingDirector.Policy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagingDirector  extends User implements Serializable{
     
    
    
    public ManagingDirector(String name, Integer ID, String password, String email, String gender, LocalDate DOB) {
        super(name, ID, password, email, gender, DOB);
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
    
    
    public void createPolicy( String policyTitle, String policyDetails,LocalDate policyEffectiveDate){ 
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("PolicyInfo.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
             Policy newPolicy = new Policy(policyTitle,  policyDetails,  policyEffectiveDate);
             oos.writeObject(newPolicy);
             System.out.println("Policy written successfully!");
             
             
         
      
         
         } 
        catch (IOException ex) {
             Logger.getLogger(ManagingDirector.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            
                if (oos != null) try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManagingDirector.class.getName()).log(Level.SEVERE, null, ex);
                }
                
           
        }
    }
    
}    
     
