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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class IncomingOrdersController implements Initializable {

    @FXML
    private TableView<?> incomingOrderTableView;
    @FXML
    private TableColumn<?, ?> orderNumberTableColumn;
    @FXML
    private TableColumn<?, ?> productTableColumn;
    @FXML
    private TableColumn<?, ?> quantityTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) {
    }

    @FXML
    private void viewOrderButtonMouseOnClicked(ActionEvent event) {
    }
    
}
