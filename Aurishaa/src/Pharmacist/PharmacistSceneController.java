/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package pharmacist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author jupit
 */
public class PharmacistSceneController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button dashboardButton;
    @FXML
    private Button leaveRequestButton;
    @FXML
    private Button addNewMedicineButton;
    @FXML
    private Button checkStockButton;
    @FXML
    private Button searchMedicineButton;
    @FXML
    private Button distributeMedicineButton;
    @FXML
    private Button generateReportButton;
    @FXML
    private Button setReminderButton;
    @FXML
    private Button researchProposalButton;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dashboardOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void leaveRequestOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void addNewMedicineOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void checkStockOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void searchMedicineOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void distributeMedicineOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void generateReportOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void setReminderOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void researchProposalOnMouseClick(ActionEvent event) {
    }
    
}
