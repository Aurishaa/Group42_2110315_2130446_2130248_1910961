
package SupplyChainManager;

import Classes.ProductSample;
import Classes.SuppliedProduct;
import Users.SupplyChainManager;
import static Users.SupplyChainManager.approveProduct;
import static Users.SupplyChainManager.updateInventory;
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


public class InventoryController implements Initializable {

    @FXML
    private TableView<SuppliedProduct> inventoryInfoTableView;
    @FXML
    private TableColumn<SuppliedProduct, String> productNameTableColumn;
    @FXML
    private TableColumn<SuppliedProduct, Integer> quantityTableColumn;
    @FXML
    private TableColumn<SuppliedProduct, String> supplyDateTableColumn;
    @FXML
    private TableColumn<SuppliedProduct, String> productTypeTableColumn;

    private SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
    
    
    ObservableList<SuppliedProduct> suppliedProductInfo = updateInventory();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          productNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
          quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
          supplyDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("supplyDate"));
          productTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));
          
      
    inventoryInfoTableView .setItems(suppliedProductInfo);
    }     

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
   Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/SupplyChainManager/SupplyChainManager_Dashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void saveButtonMouseOnClicked(ActionEvent event) {
     Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("All supplied products are shown successfully.");
        alert.showAndWait();
    }
    
}
