/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import Classes.Feedback;
import Users.Distributor;
import Users.User;
import java.io.IOException;
import java.time.LocalDate;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class ProvideFeedbackController implements Initializable {

    @FXML
    private TextArea feedbackTextArea;
    @FXML
    private DatePicker feedbackdateDatePicker;
     
    
    Distributor distributor;

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackToDashboardOnButtonClick(ActionEvent event) throws IOException {
         Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Distributor/DistributorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void saveFeedbackOnButtonClick(ActionEvent event) {
        String feedback = feedbackTextArea.getText();
        LocalDate feedbackdate=feedbackdateDatePicker.getValue();
       if (feedback.isEmpty() || feedbackdate == null) {
    return;
}
        
        Distributor.addFeedBack(feedback,feedbackdate);
        
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Feedback added");
            a.showAndWait();
        
    }
    
}
