/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.Serializable;
import java.time.LocalDate;


public abstract class User implements Serializable{
    private static final long serialVersionUID = 345L;
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

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", ID=" + ID + ", password=" + password + ", email=" + email + ", gender=" + gender + ", DOB=" + DOB + '}';
    }
    
    
}
