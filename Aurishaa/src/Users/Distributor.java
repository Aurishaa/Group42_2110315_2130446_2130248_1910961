/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.Serializable;
import java.time.LocalDate;


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
    
    
    
    
}
