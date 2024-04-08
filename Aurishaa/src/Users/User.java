/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Classes.LoginInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;


public abstract class User implements Serializable{
  //  private static final long serialVersionUID = 345L;
    public String name;
    public final Integer ID;
    protected String password;
    public String email;

    public User(String name, Integer ID, String password, String email) {
        this.name = name;
        this.ID = ID;
        this.password = password;
        this.email = email;
    }
    

    
    

    public Integer getID() {
        return ID;
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
  
    
    public static int tryToLogin(int idcheck, String passcheck){
            File f = null;
            FileInputStream fis = null;      
            ObjectInputStream ois = null;
            boolean idFound = false;
            boolean passMatched = false;
            int userType=0;
            try {
                f = new File("LoginInfo.bin");
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                LoginInfo tempLogin;
                try{
                    System.out.println("Printing login objects");
                    while(true){
                        if (idFound){break;}
                        tempLogin = (LoginInfo) ois.readObject();
                        System.out.println(tempLogin.toString());
                        if (idcheck==tempLogin.getUserId()){
                            idFound = true;
                            if (passcheck.equals(tempLogin.getUserPass())){
                                passMatched = true;
                                switch (tempLogin.getUserType()) {
                                    case "ManagingDirector":
                                        userType=3;
                                        break;
                                    case "Distributor":
                                        userType=4;
                                        break;
                                    case "Supplier":
                                        userType=5;
                                        break;
                                    case "SupplyChainManager":
                                        userType=6;
                                        break;
                                    case "Pharmacist":
                                        userType=7;
                                        break;
                                    case "QualityControlManager":
                                        userType=8;
                                        break;
                                    case "ProductionManager":
                                        userType=9;
                                        break;
                                    default:
                                        userType=10;
                                        break;
                                }
                                break;
                            }
                        }
                    }
                }
                catch(IOException | ClassNotFoundException e){
                    System.out.println(e.toString());
                    System.out.println("IOException | ClassNotFoundException in reading bin file");
                }
                System.out.println("End of file\n");

                if (idFound){
                    if(passMatched){
                        return userType;
                    }
                    else{
                        return 2;
                    }
                }
                else{
                    return 1;
                }

            } catch (IOException ex) {
                System.out.println("IOException on entire file handling");
                return 0;
            }
            finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
            }
        }

        public static User findUser(int id, String type){
            File f = null;
            FileInputStream fis = null;      
            ObjectInputStream ois = null;
            String path = "";
            switch(type){
                case "ManagingDirector":
                    path="ManagingDirector.bin";
                    break;
                case "Distributor":
                    path="Distributor.bin";
                    break;
                case "Supplier":
                    path="Supplier.bin";
                    break;
                case "SupplyChainManager":
                    path="SupplyChainManager.bin";
                    break;
                
            }

            try {
                f = new File(path);
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                User tempUser = null;
                try{
                    System.out.println("Printing user objects");
                    while(true){
                        switch(type){
                            case "ManagingDirector": 
                                tempUser = (ManagingDirector) ois.readObject();
                                break;
                            case "Distributor": 
                                tempUser = (Distributor) ois.readObject();
                                break;
                            case "Supplier": 
                                tempUser = (Supplier) ois.readObject();
                                break;
//                            case "SupplyChainManager": 
//                                tempUser = (SupplyChainManager) ois.readObject();
//                                break;
                            
                        }
                        if (id==tempUser.getID()){
                            System.out.print("User found: ");
                            System.out.println(tempUser.toString());
                            return tempUser;
                        }
                    }
                }
                catch(IOException | ClassNotFoundException e){
                    System.out.println(e.toString());
                    System.out.println("IOException | ClassNotFoundException in reading bin file");
                }
                System.out.println("End of file\n");
            } catch (IOException ex) {
                System.out.println("IOException on entire file handling");
            }
            finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
            }
            return null;
        }

    }
