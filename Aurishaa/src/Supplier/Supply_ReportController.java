/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Supplier;

import Users.Supplier;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class Supply_ReportController implements Initializable {
    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @FXML    private Label supplyReportInfoLabel;
    @FXML    private TextField reportIdTextField;
    @FXML    private TextArea descriptionTextArea;
    @FXML    private DatePicker monthDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generateReportButtonMouseOnClicked(ActionEvent event) {
       int reportId =Integer.parseInt(reportIdTextField.getText());
       String description=descriptionTextArea.getText();
       LocalDate month = monthDatePicker.getValue();
       
       if (reportId <= 0 ||  description == null||month==null) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the required fields.");
        alert.showAndWait();
        return;
       }
       Supplier.generateSupplyReport(reportId,month, description);
       
       String reportInfo = "reportId: " + reportId + "\n\n"
                + "description: " + description + "\n\n"
                + " month:"+month+"\n\n"
                ;
        supplyReportInfoLabel.setText(reportInfo);
        System.out.println("Successful");

    }
    

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
   Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Supplier/Supplier_Dashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
