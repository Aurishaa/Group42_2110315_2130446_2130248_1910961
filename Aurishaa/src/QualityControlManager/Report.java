/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QualityControlManager;
import java.io.Serializable;

public class Report implements Serializable {

    private final String Report;
    private final String Reason;

    public Report(String Report, String Reason) {
        this.Report = Report;
        this.Reason = Reason;
    }

    public String getReport() {
        return Report;
    }

    public String getReason() {
        return Reason;
    }
}

