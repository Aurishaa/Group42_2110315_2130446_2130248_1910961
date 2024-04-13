
package SupplyChainManager;

import java.io.Serializable;
import java.time.LocalDate;

public class Budget implements Serializable {
    private String department;
    private int amount;
    private LocalDate requestDate;

    public Budget() {
    }

    public Budget(String department, int amount, LocalDate requestDate) {
        this.department = department;
        this.amount = amount;
        this.requestDate = requestDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "Budget{" + "department=" + department + ", amount=" + amount + ", requestDate=" + requestDate + '}';
    }

    
    
    
}
