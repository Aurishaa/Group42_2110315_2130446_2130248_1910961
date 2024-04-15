/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package QualityControlManager;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class ScheduledTestingController implements Initializable {

    @FXML
    private DatePicker datePicker1;
    @FXML
    private TextField testTypeTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void datePicker1OnMouseClick(ActionEvent event) {
    }

    @FXML
    private void backOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void submitOnMouseClick(ActionEvent event) {
        String testTypeText = testTypeTextField.getText();
        LocalDate selectedDate = datePicker1.getValue();

        if (testTypeText != null && !testTypeText.isEmpty() && selectedDate != null) {
            showAlert("Reminder Set", "Type of Test " + testTypeText + "\nDate: " + selectedDate);
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
