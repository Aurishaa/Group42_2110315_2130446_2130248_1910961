/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;

import Users.ManagingDirector;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ManagingDirectorDashboardController implements Initializable {

    @FXML
    private BorderPane mDDashboardBorderpane;
    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewReportOnClick(ActionEvent event) {
    }

    @FXML
    private void createOREditPolicyOnPolicy(ActionEvent event) {
    }

    @FXML
    private void setGoalOnClick(ActionEvent event) {
    }

    @FXML
    private void approveBudgetOnClick(ActionEvent event) {
    }

    @FXML
    private void scheduleMeetingOnClick(ActionEvent event) {
    }

    @FXML
    private void dashboardMenuItem(ActionEvent event) {
    }

    @FXML
    private void logoutOnClick(ActionEvent event) {
    }

    @FXML
    private void exitMenuItem(ActionEvent event) {
    }

   
}