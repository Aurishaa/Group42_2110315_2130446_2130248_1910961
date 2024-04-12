
package Supplier;

/**
 *
 * @author Dell
 */
public class SupplierInformationTable {
    private String companyName;
    private String contactPerson;
    private String contactNumber;

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
