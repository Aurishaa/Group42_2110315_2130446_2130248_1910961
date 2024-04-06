/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.time.LocalDate;


public class Supplier extends User{
    public String companyName;
    public String contactPerson;
    public int contactNumber;

    public Supplier(String companyName, String contactPerson, int contactNumber, String name, Integer ID, String password, String email, String gender, LocalDate DOB) {
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

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Supplier{" + "companyName=" + companyName + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + '}';
    }

    
    }




