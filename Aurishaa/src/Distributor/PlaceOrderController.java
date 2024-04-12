/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.OrderedProducts;
import Users.Distributor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class PlaceOrderController implements Initializable {

    @FXML
    private Label unitPriceLabel;
    @FXML
    private TableView<OrderedProducts> productDetailsTableView;
    @FXML
    private TableColumn<OrderedProducts, String> productNameTableColumn;
    @FXML
    private TableColumn<OrderedProducts,Integer> productQuantityTableColumn;
    @FXML
    private TableColumn<OrderedProducts, Float> productUnitPriceTableColumn;
    @FXML
    private TableColumn<OrderedProducts, Float> totalPriceTableColumn;
    @FXML
    private TextField productQuantityTextField;
    @FXML
    private ComboBox<String> productListComboBox;
    Distributor distributor;

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           productNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("Product Name "));
           productQuantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("Quantity "));
           productUnitPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("Unit Price "));
           totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("Total Price "));
           
           productListComboBox.getItems().addAll();


    }    

    @FXML
    private void addToCartOnButtonClicked(ActionEvent event) {
    }

    @FXML
    private void confirmOrderButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
