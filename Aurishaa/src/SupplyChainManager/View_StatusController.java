/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainManager;

import Classes.OrderStatus;
import Users.SupplyChainManager;
import static Users.SupplyChainManager.viewStatus;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class View_StatusController implements Initializable {

    @FXML
    private TableView<OrderStatus> statusInfoTableView;
    @FXML
    private TableColumn<OrderStatus, Integer> deliveryIdTableColumn;
    @FXML
    private TableColumn<OrderStatus, String> deliveryDateTableColumn;
   
    @FXML
    private TableColumn<OrderStatus, String> deliveryStatusTableColumn;

    private SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
    
    ObservableList<OrderStatus> statusInfo =viewStatus();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        deliveryIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryId"));
          deliveryDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryDate"));
          
          deliveryStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("deliveryStatus"));
          
      
    statusInfoTableView .setItems(statusInfo);
    }      

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/SupplyChainManager/SupplyChainManager_Dashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
