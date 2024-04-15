package Supplier;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Supplied_ProductsController implements Initializable {
    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    

    @FXML
    private DatePicker supplyDatePicker;
    @FXML
    private TextField productNameTextField;
    @FXML
    private TextField quantityTextField;
    @FXML
    private ComboBox<String> productTypeComboBox;
    @FXML
    private Label updatedInfoLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productTypeComboBox.getItems().addAll("APIs","Excipients","Solvents","Packaged materials");
    }    

    @FXML
    private void updateButtonMouseOnClicked(ActionEvent event) {
    
        
        String productName = productNameTextField.getText();
        int quantity =Integer.parseInt(quantityTextField.getText());
        LocalDate supplyDate= supplyDatePicker.getValue();
        String productType =productTypeComboBox.getValue();
        if (productName== null || quantity<=0 || supplyDate == null||productType==null) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the required fields.");
        alert.showAndWait();
        return;
   
        
}

        Supplier.suppliedProduct(productName, quantity , supplyDate,productType);
    
        String suppliedProductInfo = "Name of Product: " + productName + "\n\n"
                + "Supplied Quantity: " + quantity + "\n\n"
                + "Date of Supply: " + supplyDate + "\n\n"
                +"Type of Product: "+productType +"\n\n";
        updatedInfoLabel.setText(suppliedProductInfo);
        System.out.println("Successful");
       
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Supplied Product has been updated successfully.");
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




