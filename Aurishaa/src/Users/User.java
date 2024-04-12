/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.Serializable;
import java.time.LocalDate;


public  class User implements Serializable{
    public String name;
    public final Integer ID;
    protected String password;
    public String email; 
    protected final LocalDate DOB;
     public String Group;

    public User(String name, Integer ID, String password, String email, LocalDate DOB, String Group) {
        this.name = name;
        this.ID = ID;
        this.password = password;
        this.email = email;
        this.DOB = DOB;
        this.Group = Group;
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

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", ID=" + ID + ", password=" + password + ", email=" + email + ", DOB=" + DOB + ", Group=" + Group + '}';
    }

    

}  