/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;

import Users.ManagingDirector;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CreatePolicyController implements Initializable {
      private ManagingDirector managingDirector;
      
      public ManagingDirector getmanagingDirector() {
        return managingDirector;
    }

    public void setmanagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }

  

    @FXML
    private TextField policyTitleTextField;
    @FXML
    private TextField policyDetailsTextField;
    @FXML
    private DatePicker policyDatePicker;
    @FXML
    private Label policyInfoLabel;
    
    
    
   
    
    @Override
    
    
    public void initialize(URL url, ResourceBundle rb) {
       
    }  

    @FXML
    
    
    private void savePolicyButtonOnClick(ActionEvent event) {
       
        
        
        String policytitle = policyTitleTextField.getText();
        String policyDetails = policyDetailsTextField.getText();
        LocalDate policyEffectiveDate = policyDatePicker.getValue();
        if (policytitle == null || policyDetails == null || policyEffectiveDate == null) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the required fields.");
        alert.showAndWait();
        return;
   
        
}

        managingDirector.createPolicy(policytitle, policyDetails, policyEffectiveDate);
    
        String policyInfo = "Policy Title: " + policytitle + "\n\n"
                + "Policy Details: " + policyDetails + "\n\n"
                + "Effective from: " + policyEffectiveDate + "\n\n";
        policyInfoLabel.setText(policyInfo);
        System.out.println("Successful");
       
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("New policy has been created successfully.");
        alert.showAndWait();
    
    
    }   

    @FXML
    private void downloadPolicyButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
