/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Supplier;

import Classes.NewlyAddedProduct;
import Users.Supplier;
import static Users.Supplier.viewNewProduct;
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

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class Order_ListController implements Initializable {

    @FXML
    private TableView<NewlyAddedProduct> newProductTableInfo;
    @FXML
    private TableColumn<NewlyAddedProduct, Integer> productIdTableColumn;
    @FXML
    private TableColumn<NewlyAddedProduct, String> productNameTableColumn;
    @FXML
    private TableColumn<NewlyAddedProduct, Integer> quantityTableColumn;
    @FXML
    private TableColumn<NewlyAddedProduct, String> productTypeTableColumn;
    @FXML
    private TableColumn<NewlyAddedProduct, String> descriptionTableColumn;

    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    private NewlyAddedProduct newlyAddedProduct;

    public NewlyAddedProduct getNewlyAddedProduct() {
        return newlyAddedProduct;
    }

    public void setNewlyAddedProduct(NewlyAddedProduct newlyAddedProduct) {
        this.newlyAddedProduct = newlyAddedProduct;
    }
       
    ObservableList<NewlyAddedProduct> productInfo = viewNewProduct();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       productIdTableColumn.setCellValueFactory(new PropertyValueFactory<NewlyAddedProduct,Integer>(" productId"));
       productNameTableColumn.setCellValueFactory(new PropertyValueFactory<NewlyAddedProduct,String>("productName"));
       quantityTableColumn.setCellValueFactory(new PropertyValueFactory<NewlyAddedProduct,Integer>("quantity"));
       productTypeTableColumn.setCellValueFactory(new PropertyValueFactory<NewlyAddedProduct,String>("productType"));
       descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<NewlyAddedProduct,String>("description"));
       
    newProductTableInfo.setItems(productInfo);
    }    

    @FXML
    private void newlyAddedProductButtonMouseOnClicked(ActionEvent event) {
    Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("All the new orders has been added.");
        alert.showAndWait(); 
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

