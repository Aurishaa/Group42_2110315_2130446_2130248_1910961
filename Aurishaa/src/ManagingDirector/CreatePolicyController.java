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
       
        
        
        String policyTitle = policyTitleTextField.getText();
        String policyDetails = policyDetailsTextField.getText();
        LocalDate policyEffectiveDate = policyDatePicker.getValue();
        if (policyTitle == null || policyDetails == null || policyEffectiveDate == null) {
   
        return; 
}

        managingDirector.createPolicy(policyTitle, policyDetails, policyEffectiveDate);
    
        String policyInfo = "Policy Title: " + policyTitle + "\n\n"
                + "Policy Details: " + policyDetails + "\n\n"
                + "Effective from: " + policyEffectiveDate + "\n\n";
        policyInfoLabel.setText(policyInfo);
        System.out.println("Successful");
       
    
    
    }   

    @FXML
    private void downloadPolicyButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
