/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Common;

import Distributor.DistributorDashboardController;
import ManagingDirector.ManagingDirectorDashboardController;
import Users.Distributor;
import Users.ManagingDirector;
import Users.User;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LoginController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField pwPasswordField;
    Alert userNotFound = new Alert(Alert.AlertType.WARNING, "User does not exist");
    Alert wrongpassword = new Alert(Alert.AlertType.WARNING, "Password Incorrect");
    Alert wrongID = new Alert(Alert.AlertType.WARNING, "Invalid User ID");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    

    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
        if (idTextField.getText() == null || idTextField.getText().trim().isEmpty()){
            wrongID.show();
        }
        else if (pwPasswordField.getText() == null || pwPasswordField.getText().trim().isEmpty()) {
            wrongpassword.show();
        }
        else{
            try{
                int id = Integer.parseInt(idTextField.getText());
                String pass = pwPasswordField.getText();
                int logIn = User.tryToLogin(id, pass);
                
                switch(logIn){
                    case 1: userNotFound.show(); break;                  
                    case 2: wrongpassword.show(); break;                
                    case 3:
                                               
                        Parent managingDirectorDashboard = null;
                        FXMLLoader managingDirectorLoader = new FXMLLoader(getClass().getResource("/ManagingDirector/ManagingDirectorDashboard.fxml"));
                        managingDirectorDashboard = (Parent) managingDirectorLoader.load(); 
                        Scene managingDirectorScene = new Scene(managingDirectorDashboard);
                        
                        ManagingDirectorDashboardController m = managingDirectorLoader.getController();
                        m.setManagingDirector((ManagingDirector) User.findUser(id, "ManagingDirector"));
                        
                        Stage managingDirectorStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        managingDirectorStage.setScene(managingDirectorScene);
                        managingDirectorStage.show();
                        break;
                    case 4:
                                           
                        
   
                        Parent distributorDashboard = null;
                        FXMLLoader distributorLoader = new FXMLLoader(getClass().getResource("/Distributor/DistributorDashboard.fxml"));
                        distributorDashboard = (Parent) distributorLoader.load(); 
                        Scene distributorScene = new Scene(distributorDashboard);
                        
                        DistributorDashboardController d = distributorLoader.getController();
                        d.setDistributor((Distributor) User.findUser(id, "Distributor"));
                        
                        Stage distributorStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        distributorStage.setScene(distributorScene);
                        distributorStage.show();
                        break;
                }
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }

            }       
   
    
//    @FXML
    public void signUpButtonOnClick(ActionEvent event) {
        
    }
}


   