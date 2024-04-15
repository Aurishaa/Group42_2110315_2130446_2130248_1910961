/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.Task;
import Users.Distributor;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class ViewTaskController implements Initializable {

    @FXML
    private TableView<Task> assignedTaskTableView;
    @FXML
    private TableColumn<Task, String> assignedToTableColumn;
    @FXML
    private TableColumn<Task,String> taskDetailsTableColumn;
    @FXML
    private TableColumn<Task,LocalDate> dueDateTableColumn;
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
      
        assignedToTableColumn.setCellValueFactory(new PropertyValueFactory<>("assignedTo"));
                taskDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("taskDetails"));
        dueDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
            assignedTaskTableView.setItems(Distributor.viewAssignedTask());
        
    }    

    @FXML
    private void goToPreviousSceneButtonOnCLick(ActionEvent event) {
    }

    @FXML
    private void markAsDoneButtonOnClick(ActionEvent event) {
        
         Task selectedTask = assignedTaskTableView.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            assignedTaskTableView.getItems().remove(selectedTask);
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Task Completed");
        successAlert.setHeaderText(null);
        successAlert.setContentText("Task marked as completed successfully!");
        successAlert.showAndWait();
    } else {
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("Error");
        errorAlert.setHeaderText(null);
        errorAlert.setContentText("Please select a task to mark as completed.");
        errorAlert.showAndWait();
    }
}
    }
