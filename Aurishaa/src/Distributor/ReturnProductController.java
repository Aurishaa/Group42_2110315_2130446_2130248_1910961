/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.Product;
import Users.Distributor;
import static Users.Distributor.returnProduct;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ReturnProductController implements Initializable {

    @FXML
    private TableView<Product> productDetailsTableView;
    @FXML
    private TableColumn<Product,String> productNameTableColumn;
    @FXML
    private TableColumn<Product, Integer> quantityTableColumn;
    @FXML
    private TableColumn<Product, Float> unitPiceTableColumn;
    @FXML
    private TableColumn<Product, Float> totalPriceTableColumn;
    @FXML
    private TextArea reasonTextArea;

    private Distributor distributor;

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
    
    ObservableList<Product> productItem = returnProduct();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
           quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
           unitPiceTableColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
           totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
           
         ObservableList<Product> cartItems = distributor.returnProduct();
        productDetailsTableView.setItems(cartItems);
    }
           
        

    @FXML
    private void sendReasonOnButtonClick(ActionEvent event) {
        
    }

    @FXML
    private void veiewDetailsOnButtonClick(ActionEvent event) {
       Product selectedProduct = productDetailsTableView.getSelectionModel().getSelectedItem();
    if (selectedProduct != null) {
        // Remove selected product from cart
        ObservableList<Product> productInfo = productDetailsTableView.getItems();
        productInfo.remove(selectedProduct);
        
        // Show success alert
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText(null);
        successAlert.setContentText("Product returned successfully!");
        successAlert.showAndWait();
    } else {
        // Show alert if no product is selected
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please select a product to return.");
        alert.showAndWait();
    }} 

    

    @FXML
    private void goBackToDashboardOnButtonClick(ActionEvent event) {
    }
    
}
