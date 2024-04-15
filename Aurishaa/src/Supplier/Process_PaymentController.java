/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Supplier;

import Classes.OrdersSCM;
import Classes.Payment;
import Users.Supplier;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class Process_PaymentController implements Initializable {

    @FXML    private TableView<Payment> paymentInfoTableView;
   
    @FXML    private TableColumn<Payment, String> productNameTableColumn;
    @FXML    private TableColumn<Payment, String> quantitiesTableColumn;
    @FXML    private TableColumn<Payment, String> unitPriceTableColumn;
    @FXML    private TableColumn<Payment, String> totalPriceTableColumn;
    
    @FXML    private TextField productNameTextField;
    @FXML    private TextField quantitiesTextField;
    @FXML    private TextField unitPriceTextField;
    @FXML    private TextField totalPriceTextField;

    public Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    ObservableList<Payment> paymentInfo = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       productNameTableColumn.setCellValueFactory(new PropertyValueFactory<Payment,String>("productName"));
       quantitiesTableColumn.setCellValueFactory(new PropertyValueFactory<Payment,String>("quantities"));
       unitPriceTableColumn.setCellValueFactory(new PropertyValueFactory<Payment,String>("unitPrice"));
       totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<Payment,String>("totalPrice"));
       
      paymentInfoTableView.setItems(paymentInfo); 
       
    }     

    @FXML
    private void confirmPaymentButtonMouseOnClicked(ActionEvent event) {
      
        String  productName=productNameTextField.getText();      
        String quantities=quantitiesTextField.getText();
        String unitPrice=unitPriceTextField.getText();
        String totalPrice=totalPriceTextField.getText();
        
       
      
        paymentInfoTableView.getItems().add(new Payment(productName,quantities,unitPrice,totalPrice));
        Supplier.processPayment(productName, quantities, unitPrice, totalPrice);
    }

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
   Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Supplier/Supplier_Dashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
