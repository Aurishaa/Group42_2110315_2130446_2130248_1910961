
package SupplyChainManager;


import Classes.SupplierInformationTable;
import Users.Supplier;


import Users.SupplyChainManager;
import static Users.SupplyChainManager.viewSuppliers;
//import static Users.SupplyChainManager.viewSuppliers;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class ViewSuppliersController implements Initializable {
    private SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
      

    
    @FXML
    private TableView<SupplierInformationTable> supplierInfoTableView;
    @FXML
    private TableColumn<SupplierInformationTable, String> companyNameTableColumn;
    @FXML
    private TableColumn<SupplierInformationTable, String> contactPersonTableColumn;
    @FXML
    private TableColumn<SupplierInformationTable, String> contactNumberTableColumn;

    ObservableList<SupplierInformationTable> supplierInfo = viewSuppliers();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         companyNameTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("companyName"));
         contactPersonTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactPerson"));
         contactNumberTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactNumber"));
     

   supplierInfoTableView.setItems(supplierInfo);

    
    
    }    

    @FXML
    private void viewSuppliersButtonMouseOnClicked(ActionEvent event) {
         Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("All the informations has been added.");
        alert.showAndWait();    
      
          
    }

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event)  throws IOException {
        String filepath = "SupplyChainManager_Dashboard.fxml";

        Parent gotoscene2 = FXMLLoader.load(getClass().getResource(filepath));
        Scene scene = new Scene(gotoscene2);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
