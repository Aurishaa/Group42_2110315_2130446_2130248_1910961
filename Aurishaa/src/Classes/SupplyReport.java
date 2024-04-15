/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Dell
 */
public class SupplyReport implements Serializable{
    public int reportId;
    public LocalDate month;
    
    public String description;

    public SupplyReport(int reportId, LocalDate month, String description) {
        this.reportId = reportId;
        this.month = month;
        this.description = description;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public LocalDate getMonth() {
        return month;
    }

    public void setMonth(LocalDate month) {
        this.month = month;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SupplyReport{" + "reportId=" + reportId + ", month=" + month + ", description=" + description + '}';
    }
    
    
    
}
