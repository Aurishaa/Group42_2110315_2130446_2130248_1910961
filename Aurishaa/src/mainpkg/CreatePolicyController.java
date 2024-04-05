/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CreatePolicyController implements Initializable {

    @FXML
    private TextField policyTitleTextField;
    @FXML
    private TextField policyDetailsTextField;
    @FXML
    private DatePicker policyDatePicker;
    @FXML
    private Label policyInfoLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void savePolicyButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            f = new File("PolicyInfo.bin");
            if (f.exists()) fos = new FileOutputStream(f, true);
            else fos = new FileOutputStream(f);

            dos = new DataOutputStream(fos);
        
        
         String policyTitle=policyTitleTextField.getText();
         String policyDetails=policyDetailsTextField.getText();
         String policyEffectiveDate = policyDatePicker.getValue().toString();
         
         
         String policyInfo= "Policy Title: " + policyTitle + "\n" +"\n"
                          + "Policy Details: " + policyDetails + "\n" +"\n" 
                          + "Effective from: " + policyEffectiveDate + "\n"+ "\n" ;
         dos.writeUTF(policyInfo);
         dos.writeUTF("\n----------------------\n");
         policyInfoLabel.setText(policyInfo);
         
         } 
         catch (IOException ex) {
            Logger.getLogger(CreatePolicyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            
                if (dos != null) try {
                    dos.close();
                } catch (IOException ex) {
                    Logger.getLogger(CreatePolicyController.class.getName()).log(Level.SEVERE, null, ex);
                }
           
        }
         
    }
    
   

    @FXML
    private void downloadPolicyButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
