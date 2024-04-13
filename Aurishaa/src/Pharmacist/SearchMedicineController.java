/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Pharmacist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class SearchMedicineController implements Initializable {

    @FXML
    private TextField medicineNameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/PharmacistScene.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
private void searchMedicineButtonOnMouseClick(ActionEvent event) {
    String medicineName = medicineNameTextField.getText();
    
    if (medicineName.isEmpty()) {
        showAlert(Alert.AlertType.WARNING, "Empty Field", "Please enter a medicine name.");
        return;
    }
    
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("medicines.bin"))) {
        List<Medicine> medicines = new ArrayList<>();
        
        // Read all Medicine objects from the file
        while (true) {
            try {
                Medicine medicine = (Medicine) ois.readObject();
                medicines.add(medicine);
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found: " + e.getMessage());
            } catch (IOException e) {
                // End of file reached
                break;
            }
        }
        
        // Search for the medicine name
        boolean found = false;
        for (Medicine medicine : medicines) {
            if (medicine.getName().equalsIgnoreCase(medicineName)) {
                found = true;
                break;
            }
        }
        
        // Show alert based on search result
        if (found) {
            showAlert(Alert.AlertType.INFORMATION, "Medicine Found", "Medicine is found.");
        } else {
            showAlert(Alert.AlertType.WARNING, "Medicine Not Found", "Medicine is not found.");
        }
        
    } catch (IOException e) {
        showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while reading the file.");
    }
    
}
    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
