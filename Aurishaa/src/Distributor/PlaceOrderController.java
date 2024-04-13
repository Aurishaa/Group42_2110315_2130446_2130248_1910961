/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.Product;
import Users.Distributor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class PlaceOrderController implements Initializable {

    @FXML
    private Label unitPriceLabel;
    @FXML
    private TableView<Product> productDetailsTableView;
    @FXML
    private TableColumn<Product, String> productNameTableColumn;
    @FXML
    private TableColumn<Product,Integer> productQuantityTableColumn;
    @FXML
    private TableColumn<Product, Float> productUnitPriceTableColumn;
    @FXML
    private TableColumn<Product, Float> totalPriceTableColumn;
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
    private ObservableList<Product> productInfo = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
           productNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
           productQuantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
           productUnitPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
           totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
           
           productListComboBox.getItems().addAll("Napa","Ace","Nebanol","De-rash","Finix");
           
        
    
        productListComboBox.setOnAction(event -> {
        // Get the selected product
        String selectedProduct = productListComboBox.getValue();

        // Set the unit price label based on the selected product
        if ("Napa".equals(selectedProduct)) {
            unitPriceLabel.setText("10.0");
        } else if ("Ace".equals(selectedProduct)) {
            unitPriceLabel.setText("12.0");
        } else if ("Nebanol".equals(selectedProduct)) {
            unitPriceLabel.setText("8.0");
        } else if ("De-rash".equals(selectedProduct)) {
            unitPriceLabel.setText("15.0");
        } else if ("Finix".equals(selectedProduct)) {
            unitPriceLabel.setText("20.0");
        } else {
            unitPriceLabel.setText("0.0"); // Default value if no product is selected
        }
    });
    

    }
    @FXML
private void addToCartOnButtonClicked(ActionEvent event) {
    String productName = productListComboBox.getValue();
    int quantity = Integer.parseInt(productQuantityTextField.getText());
    float unitPrice = Float.parseFloat(unitPriceLabel.getText());

    Product productItem = new Product(productName, quantity, unitPrice, 0.0f);

    float totalPrice = productItem.findTotalPrice();
    productItem.setTotalPrice(totalPrice);

    productInfo.add(productItem);

    productDetailsTableView.setItems(productInfo);
   
    Distributor.placeOrder(productName,quantity,unitPrice,totalPrice);
}

    

    @FXML
    private void confirmOrderButtonOnClick(ActionEvent event) {
   

    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Order Confirmation");
    alert.setHeaderText(null);
    alert.setContentText("Order placed successfully!");
    alert.showAndWait();
    }

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Distributor/DistributorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
