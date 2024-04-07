/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

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
    public final String gender;
    
    protected final LocalDate DOB;

    public User(String name, Integer ID, String password, String email, String gender, LocalDate DOB) {
        this.name = name;
        this.ID = ID;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
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
}   
    
//            public static int tryToLogin(int idcheck, String passcheck){
//            File f = null;
//            FileInputStream fis = null;      
//            ObjectInputStream ois = null;
//            boolean idFound = false;
//            boolean passMatched = false;
//            int userType=0;
//            try {
//                f = new File("LoginInfo.bin");
//                fis = new FileInputStream(f);
//                ois = new ObjectInputStream(fis);
//                LoginInfo tempLogin;
//                try{
//                    System.out.println("Printing login objects");
//                    while(true){
//                        if (idFound){break;}
//                        tempLogin = (LoginInfo) ois.readObject();
//                        System.out.println(tempLogin.toString());
//                        if (idcheck==tempLogin.getUserId()){
//                            idFound = true;
//                            if (passcheck.equals(tempLogin.getUserPass())){
//                                passMatched = true;
//                                switch (tempLogin.getUserType()) {
//                                    case "Doctor":
//                                        userType=3;
//                                        break;
//                                    case "Patient":
//                                        userType=4;
//                                        break;
//                                    case "Pharmacist":
//                                        userType=5;
//                                        break;
//                                    case "Nurse":
//                                        userType=6;
//                                        break;
//                                    case "Director":
//                                        userType=7;
//                                        break;
//                                    case "Accountant":
//                                        userType=8;
//                                        break;
//                                    case "HROfficer":
//                                        userType=9;
//                                        break;
//                                    default:
//                                        userType=10;
//                                        break;
//                                }
//                                break;
//                            }
//                        }
//                    }
//                }
//                catch(IOException | ClassNotFoundException e){
//                    System.out.println(e.toString());
//                    System.out.println("IOException | ClassNotFoundException in reading bin file");
//                }
//                System.out.println("End of file\n");
//
//                if (idFound){
//                    if(passMatched){
//                        return userType;
//                    }
//                    else{
//                        return 2;
//                    }
//                }
//                else{
//                    return 1;
//                }
//
//            } catch (IOException ex) {
//                System.out.println("IOException on entire file handling");
//                return 0;
//            }
//            finally {
//                try {
//                    if(ois != null) ois.close();
//                } catch (IOException ex) { }
//            }
//        }
//
//        public static User findUser(int id, String type){
//            File f = null;
//            FileInputStream fis = null;      
//            ObjectInputStream ois = null;
//            String path = "";
//            switch(type){
//                case "Doctor":
//                    path="Doctor.bin";
//                    break;
//                case "Patient":
//                    path="Patient.bin";
//                    break;
//                case "Pharmacist":
//                    path="Pharmacist.bin";
//                    break;
//                case "Nurse":
//                    path="Nurse.bin";
//                    break;
//                case "Director":
//                    path="Director.bin";
//                    break;
//                case "Accountant":
//                    path="Accountant.bin";
//                    break;
//                case "HROfficer":
//                    path="HROfficer.bin";
//                    break;
//                case "Optometrist":
//                    path="Optometrist.bin";
//                    break;
//            }
//
//            try {
//                f = new File(path);
//                fis = new FileInputStream(f);
//                ois = new ObjectInputStream(fis);
//                User tempUser = null;
//                try{
//                    System.out.println("Printing user objects");
//                    while(true){
//                        switch(type){
//                            case "Doctor": 
//                                tempUser = (Doctor) ois.readObject();
//                                break;
//                            case "Patient": 
//                                tempUser = (Patient) ois.readObject();
//                                break;
//                            case "Pharmacist": 
//                                tempUser = (Pharmacist) ois.readObject();
//                                break;
//                            case "Nurse": 
//                                tempUser = (Nurse) ois.readObject();
//                                break;
//                            case "Director": 
//                                tempUser = (Director) ois.readObject();                            
//                                break;
//                            case "Accountant": 
//                                tempUser = (Accountant) ois.readObject();
//                                break;
//                            case "HROfficer": 
//                                tempUser = (HROfficer) ois.readObject();
//                                break;
//                            case "Optometrist": 
//                                tempUser = (Optometrist) ois.readObject();
//                                break;
//                        }
//                        if (id==tempUser.getID()){
//                            System.out.print("User found: ");
//                            System.out.println(tempUser.toString());
//                            return tempUser;
//                        }
//                    }
//                }
//                catch(IOException | ClassNotFoundException e){
//                    System.out.println(e.toString());
//                    System.out.println("IOException | ClassNotFoundException in reading bin file");
//                }
//                System.out.println("End of file\n");
//            } catch (IOException ex) {
//                System.out.println("IOException on entire file handling");
//            }
//            finally {
//                try {
//                    if(ois != null) ois.close();
//                } catch (IOException ex) { }
//            }
//            return null;
//        }
//
//    }
