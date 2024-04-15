/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Supplier;

import Classes.OrdersSCM;
import Classes.SupplierInformationTable;
import Users.Supplier;
import static Users.Supplier.viewIncomingOrders;
import static Users.SupplyChainManager.viewSuppliers;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class IncomingOrdersController implements Initializable {

    @FXML
    private TableView<OrdersSCM> incomingOrderTableView;
    @FXML
    private TableColumn<OrdersSCM, Integer> orderNumberTableColumn;
    @FXML
    private TableColumn<OrdersSCM, String> productTableColumn;
    @FXML
    private TableColumn<OrdersSCM, Integer> quantityTableColumn;

    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    ObservableList<OrdersSCM> orderInfo = viewIncomingOrders();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        orderNumberTableColumn.setCellValueFactory(new PropertyValueFactory<OrdersSCM,Integer>("orderNumber"));
       productTableColumn.setCellValueFactory(new PropertyValueFactory<OrdersSCM,String>("product"));
       quantityTableColumn.setCellValueFactory(new PropertyValueFactory<OrdersSCM,Integer>("quantity"));
    
    incomingOrderTableView.setItems(orderInfo);
    }    

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
   Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Supplier/Supplier_Dashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void viewOrderButtonMouseOnClicked(ActionEvent event) {
     Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("All the orders has been added.");
        alert.showAndWait(); 
    }
    
}
