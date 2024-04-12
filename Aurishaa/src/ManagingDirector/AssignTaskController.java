/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;
import Users.ManagingDirector;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


public class AssignTaskController implements Initializable {

    @FXML
    private ComboBox<String> userComboBox;
    @FXML
    private TextArea taskDetailsTextArea;
    @FXML
    private DatePicker duedateDatePicker;
    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     userComboBox.getItems().addAll("Supply Chain Manager","Pharmacist","Quality Control Manager","Finance Manager","Production Manager");
    }    

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/ManagingDirector/ManagingDirectorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void assignTaskButtonOnClick(ActionEvent event) {
        String assignedTo = userComboBox.getValue(); 
        LocalDate dueDate= duedateDatePicker.getValue();
        String taskDetails = taskDetailsTextArea.getText(); 


        ManagingDirector.assignTask(assignedTo, dueDate, taskDetails);

       
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Task sent");
            a.showAndWait();
        }
    }
    

