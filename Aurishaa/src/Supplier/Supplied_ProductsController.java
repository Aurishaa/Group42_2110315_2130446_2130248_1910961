/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Supplier;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class Supplied_ProductsController implements Initializable {

    @FXML
    private TextField productNameTextField;
    @FXML
    private ComboBox<?> availabilityComboBox;
    @FXML
    private Label availabilityInfoLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveButtonMouseOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) {
    }
    
}
