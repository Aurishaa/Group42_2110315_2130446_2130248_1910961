/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

  

public class AssignOrderStatusController implements Initializable {
private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @FXML
    private TextField deliveryIdTextField;
    @FXML
    private TextField quantitiesTextField;
    @FXML
    private DatePicker deliveryDatePicker;
   
    
    @FXML
    private ComboBox<String> statusComboBox;
@FXML
    private Label statusInfoLabel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      statusComboBox.getItems().addAll("Not Delivered","On Process","Delivered"); 
       
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
    private void confirmUpdateButtonMouseOnClicked(ActionEvent event) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Status has been updated successfully.");
        alert.showAndWait();
    }

    @FXML
    private void updateStatusButtonMouseOnClicked(ActionEvent event) {
       
    
        int deliveryId =Integer.parseInt(deliveryIdTextField.getText());
        int quantities =Integer.parseInt(quantitiesTextField.getText());
        LocalDate deliveryDate = deliveryDatePicker.getValue();
        String deliveryStatus=statusComboBox.getValue();
        if (deliveryId <= 0 || quantities<=0 || deliveryDate == null||deliveryStatus==null) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the required fields.");
        alert.showAndWait();
        return;
   
        
}
Supplier.orderStatus(deliveryId, deliveryDate, quantities,deliveryStatus);
    
        String statusInfo = "deliveryId: " + deliveryId + "\n\n"
                + "deliveryDate: " + deliveryDate + "\n\n"+ "quantities: " + quantities + "\n\n"
                ;
        statusInfoLabel.setText(statusInfo);
        System.out.println("Successful");

    }
    }