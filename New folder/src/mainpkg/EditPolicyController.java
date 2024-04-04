/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class EditPolicyController implements Initializable {

    @FXML
    private TableView<Policy> policyInfoTableView;
    @FXML
    private TableColumn<Policy,String> policyNameTableColumn;
    @FXML
    //private TableColumn<Policy.LocatDate> effectiveDateTableColumn;
    //@FXML
    private TextField searchPolicyTextField;
    @FXML
    private TextArea policyInfoLabel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // policyNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyName"));
         //effectiveDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("effectiveDate"));

    }    

    @FXML
    private void editAndSaveButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void selectAndViewDetailsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void searchPolicyButtonOnClick(ActionEvent event) {
    }
    
}
