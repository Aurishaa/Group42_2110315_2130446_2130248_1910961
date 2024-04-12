/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;
import Classes.Meeting;
import Users.ManagingDirector;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;



public class ScheduleMeetingController implements Initializable {

    @FXML
    private ComboBox<String> userComboBox;
    @FXML
    private DatePicker meetingdateDatePicker;
    @FXML
    private TextField meetingTimeTextField;
    @FXML
    private TableView<Meeting> meetingDetailsTableView;
    @FXML
    private TableColumn<Meeting, String> meetingWithTableColumn;
    @FXML
    private TableColumn<Meeting, LocalDate> meetingDateTableColumn;
    @FXML
    private TableColumn<Meeting, String> meetingTimeTableColumn;
    
    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }
    
    private ObservableList<Meeting> meetinglist= FXCollections.observableArrayList();

    @Override
   public void initialize(URL url, ResourceBundle rb) {
             userComboBox.getItems().addAll("Supply Chain Manager","Pharmacist","Quality Control Manager","Finance Manager","Production Manager","Distributor","Supplier");
             
        
        meetingWithTableColumn.setCellValueFactory(new PropertyValueFactory<Meeting,String>("meetingWith"));
        meetingDateTableColumn.setCellValueFactory(new PropertyValueFactory<Meeting,LocalDate>("meetingDate"));
        meetingTimeTableColumn.setCellValueFactory(new PropertyValueFactory<Meeting,String>("meetingTime"));
        meetingDetailsTableView.setItems(meetinglist);
    }  

    @FXML
    private void goBackToDashboardOnBUttonClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/ManagingDirector/ManagingDirectorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void addMeetingToTableOnButtonClick(ActionEvent event) {
     
   
    String meetingWith = userComboBox.getValue();
    LocalDate meetingDate = meetingdateDatePicker.getValue();
    String meetingTime = meetingTimeTextField.getText();
    
    if (meetingWith == null || meetingDate == null || meetingTime.isEmpty()) {
       Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the required fields.");
        alert.showAndWait();
        return;
    }
    
    if (meetingDate.isBefore(LocalDate.now())) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please select a future date for the meeting .");
        alert.showAndWait();
        return;
    }
    Meeting meetingInfo = new Meeting(meetingWith,  meetingDate,  meetingTime) ;
        meetinglist.add(meetingInfo);
    
    ManagingDirector.scheduleMeeting(meetingWith, meetingDate, meetingTime);
    userComboBox.setValue(null);
    meetingdateDatePicker.setValue(null);
    meetingTimeTextField.clear();
}

    

    }