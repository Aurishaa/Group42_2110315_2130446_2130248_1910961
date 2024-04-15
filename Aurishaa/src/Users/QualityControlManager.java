package Users;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author jupit
 */
public class QualityControlManager extends User implements Serializable{
    public String Number;
    public String Address;

    public QualityControlManager(String Number, String Address, String name, Integer ID, String password, String email, LocalDate DOB, String Group) {
        super(name, ID, password, email, DOB, Group);
        this.Number = Number;
        this.Address = Address;
    }

    public String getNumber() {
        return Number;
    }

    public void setPharmaNumber(String PharmaNumber) {
        this.Number = Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setPharmaAddress(String PharmaAddress) {
        this.Address = Address;
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
