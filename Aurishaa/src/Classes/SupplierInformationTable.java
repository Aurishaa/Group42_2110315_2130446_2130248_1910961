/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class SupplierInformationTable implements Serializable{
     private String companyName;
    private String contactPerson;
    private String contactNumber;

    public SupplierInformationTable() {
    }

    public SupplierInformationTable(String companyName, String contactPerson, String contactNumber) {
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
        return "SupplierInformationTable{" + "companyName=" + companyName + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + '}';
    }

}
