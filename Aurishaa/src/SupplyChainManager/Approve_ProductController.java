
package SupplyChainManager;


import Classes.ProductSample;

import Users.SupplyChainManager;
import static Users.SupplyChainManager.approveProduct;
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


public class Approve_ProductController implements Initializable {

    @FXML
    private TableView<ProductSample> productInfoTableView;
    @FXML
    private TableColumn<ProductSample, String> productNameTableColumn;
    @FXML
    private TableColumn<ProductSample, Integer> quantityTableColumn;
    
    @FXML
    private TableColumn<ProductSample, Integer> phonenumberTableColumn;
    @FXML
    private TableColumn<ProductSample, String> shippingAddressTableColumn;

    private SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
    ObservableList<ProductSample> productInfo = approveProduct();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       productNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
    quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    
    phonenumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
    shippingAddressTableColumn.setCellValueFactory(new PropertyValueFactory<>("shippingAddress"));
      // ObservableList<Budget> budgetList = approveBudget();
        productInfoTableView.setItems(productInfo);
    }    

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
    String filepath = "SupplyChainManager_Dashboard.fxml";

        Parent gotoscene2 = FXMLLoader.load(getClass().getResource(filepath));
        Scene scene = new Scene(gotoscene2);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void approveButtonMouseOnClicked(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Product has been approved successfully.");
        alert.showAndWait();
    }
    
}
