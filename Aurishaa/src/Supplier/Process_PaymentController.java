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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class Process_PaymentController implements Initializable {

    @FXML
    private TableView<?> paymentInfoTableView;
    @FXML
    private TableColumn<?, ?> orderIdTableColumn;
    @FXML
    private TableColumn<?, ?> productNameTableColumn;
    @FXML
    private TableColumn<?, ?> quantitiesTableColumn;
    @FXML
    private TableColumn<?, ?> unitPriceTableColumn;
    @FXML
    private TableColumn<?, ?> totalPriceTableColumn;
    @FXML
    private TextField orderIdTextField;
    @FXML
    private TextField productNameTextField;
    @FXML
    private TextField quantitiesTextField;
    @FXML
    private TextField unitPriceTextField;
    @FXML
    private TextField totalPriceTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmPaymentButtonMouseOnClicked(ActionEvent event) {
    }

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) {
    }
    
}
