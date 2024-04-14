/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainManager;

import Users.Supplier;
import Users.SupplyChainManager;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ManageOrdersController implements Initializable {

    @FXML
    private Label newProductInfoLabel;
    @FXML
    private TextField productIdTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private TextField quantityTextField;
    @FXML
    private ComboBox<String> productTypeComboBox;

    private SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productTypeComboBox.getItems().addAll("APIs","Excipients","Solvents","Packaged materials");
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
    private void submitButtonMouseOnClicked(ActionEvent event) {
   
        int productId =Integer.parseInt( productIdTextField.getText());
        String name = nameTextField.getText();
        String description = descriptionTextArea.getText();
        int quantity =Integer.parseInt( quantityTextField.getText());        
        String productType =productTypeComboBox.getValue();
        if (productId<=0 ||name==null || description == null||quantity<=0||productType==null) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the required fields.");
        alert.showAndWait();
        return;
   
        
    } 
        SupplyChainManager.addedProduct(productId,name ,description,quantity,productType);
    
        String newProductInfo ="Product ID: " + productId + "\n\n"
                +"Name of Product: " + name + "\n\n"
                + " Description: " + description + "\n\n"
                + "Quantity : " + quantity + "\n\n"
                +"Type of Product: "+productType +"\n\n";
        newProductInfoLabel.setText(newProductInfo);
        System.out.println("Successful");
       
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("New Product has been updated successfully.");
        alert.showAndWait();
    }



}
