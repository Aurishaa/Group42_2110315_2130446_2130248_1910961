/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.Stock;
import Users.Distributor;
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

public class ViewInventoryController implements Initializable {

    @FXML
    private TableView<Stock> invetoryTableView;
    @FXML
    private TableColumn<Stock, String> nameTableColumn;
    @FXML
    private TableColumn<Stock, String> priceTableColumn;
    @FXML
    private TableColumn<Stock, String> availabilityTableColumn;
    Distributor distributor;

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
    
            ObservableList<Stock> stockView =Distributor.viewInventory();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
           nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
           priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
           availabilityTableColumn.setCellValueFactory(new PropertyValueFactory<>("availability"));
           
        invetoryTableView.setItems(stockView);

    }    

    @FXML
    private void goToDashBoardButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Distributor/DistributorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
