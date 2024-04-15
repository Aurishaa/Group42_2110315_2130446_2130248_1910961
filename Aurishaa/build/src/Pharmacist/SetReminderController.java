/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Pharmacist;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class SetReminderController implements Initializable {

    @FXML
    private TextField reminderTextField;
    @FXML
    private DatePicker datePicker1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void datePicker1OnMouseClick(ActionEvent event) {
        datePicker1.valueProperty().addListener((observable, oldValue, newValue) ->{});
    }

    @FXML
    private void backOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/PharmacistScene.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void submitOnMouseClick(ActionEvent event) {
        String reminderText = reminderTextField.getText();
        LocalDate selectedDate = datePicker1.getValue();

        if (reminderText != null && !reminderText.isEmpty() && selectedDate != null) {
            showAlert("Reminder Set", "Reminder: " + reminderText + "\nDate: " + selectedDate);
        } else {
            showAlert("Error", "Please enter reminder text and select a date.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    
}
