
package Users;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author jupit
 */
public class Pharmacist extends User implements Serializable{
    public String PharmaNumber;
    public String PharmaAddress;

    public Pharmacist(String PharmaNumber, String PharmaAddress, String name, Integer ID, String password, String email, LocalDate DOB, String Group) {
        super(name, ID, password, email, DOB, Group);
        this.PharmaNumber = PharmaNumber;
        this.PharmaAddress = PharmaAddress;
    }

    public String getPharmaNumber() {
        return PharmaNumber;
    }

    public void setPharmaNumber(String PharmaNumber) {
        this.PharmaNumber = PharmaNumber;
    }

    public String getPharmaAddress() {
        return PharmaAddress;
    }

    public void setPharmaAddress(String PharmaAddress) {
        this.PharmaAddress = PharmaAddress;
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
    
}
