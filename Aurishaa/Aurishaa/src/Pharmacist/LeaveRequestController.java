package Pharmacist;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LeaveRequestController implements Initializable {

    @FXML
    private DatePicker datePicker1;
    @FXML
    private DatePicker datePicker2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void submitButtonOnMouseClick(ActionEvent event) {
        LocalDate startDate = datePicker1.getValue();
        LocalDate endDate = datePicker2.getValue();

        if (startDate != null && endDate != null) {
            if (!endDate.isBefore(startDate)) {
                showAlert(Alert.AlertType.INFORMATION, "Leave Request Submitted", "You will be absent from " + startDate + " to " + endDate);
            } else {
                showAlert(Alert.AlertType.WARNING, "Warning", "End date must be after start date.");
            }
        } else {
            showAlert(Alert.AlertType.WARNING, "Warning", "Please select start and end dates.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    private void datePicker1OnMouseClick(ActionEvent event) {
        datePicker1.valueProperty().addListener((observable, oldValue, newValue) -> {
            LocalDate selectedDate = newValue;
            System.out.println("DatePicker 1 selected date: " + selectedDate);
        });
    }

    @FXML
    private void datePicker2OnMouseClick(ActionEvent event) {
        datePicker2.valueProperty().addListener((observable, oldValue, newValue) -> {
            LocalDate selectedDate = newValue;
            System.out.println("DatePicker 2 selected date: " + selectedDate);
        });
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

