/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Pharmacist;


import Classes.Stock;
import Common.AppendableObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class AddStockController implements Initializable {

    @FXML
    private TextField productTextField;
    @FXML
    private TextField unitPriceTextField;
    @FXML
    private TextField availabilityTextField;
    String ProductName;
    String UnitPrice;
    String Availibility;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void addStockOnButtonClick(ActionEvent event) {
        
          String productName = productTextField.getText();
    String unitPrice = unitPriceTextField.getText();
    String availability = availabilityTextField.getText();
    
    Stock newStock = new Stock(productName, unitPrice, availability);
    File f = new File("Inventory.bin");
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    
    try {
        if (f.exists()) {
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);
        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(newStock);
    } catch (IOException e) {
        e.printStackTrace();
        // Optionally, provide feedback to the user about the error
    } finally {
        try {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
       
        
        
           
        
    
    
        
   


    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/PharmacistScene.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
