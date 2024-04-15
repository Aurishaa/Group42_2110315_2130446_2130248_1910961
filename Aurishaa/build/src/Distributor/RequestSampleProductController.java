/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;
import Classes.ProductSample;
import Users.Distributor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class RequestSampleProductController implements Initializable {

    @FXML
    private TextField productNameTextField;
    @FXML
    private TextField quantityTextField;
    @FXML
    private TextArea shippingAddressTextArea;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField numberTextField;
    private Distributor distributor;

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToDashboardOnButtonClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Distributor/DistributorDashBoard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

   

    @FXML
    private void sendRequentOnButtonClick(ActionEvent event) {
        String productName = productNameTextField.getText();
        int quantity = Integer.parseInt(quantityTextField.getText());
        String email  = emailTextField.getText();
        String number=numberTextField.getText();
        String shippingAddress=shippingAddressTextArea.getText();
        
       if (productName.isEmpty() || quantity <= 0 || email.isEmpty() || number.isEmpty() || shippingAddress.isEmpty()) {
       Alert alert = new Alert(Alert.AlertType.WARNING);
      alert.setTitle("Warning");
      alert.setHeaderText(null);
      alert.setContentText("Please fill in all the required fields.");
      alert.showAndWait();
      return;
}
       Distributor.requestProductSample( productName,  quantity,email, number, shippingAddress);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Sample Request has been sent successfully");
        alert.showAndWait();
    }
}



 
    
    

