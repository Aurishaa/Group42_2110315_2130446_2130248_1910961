package Pharmacist;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class PharmacistSceneController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button dashboardButton;
    @FXML
    private Button leaveRequestButton;
    @FXML
    private Button addNewMedicineButton;
    @FXML
    private Button searchMedicineButton;
    @FXML
    private Button distributeMedicineButton;
    @FXML
    private Button generateReportButton;
    @FXML
    private Button setReminderButton;
    @FXML
    private Button researchProposalButton;
    @FXML
    private Button addStockButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dashboardOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/PharmacistScene.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();   
    }

    @FXML
    private void leaveRequestOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/LeaveRequest.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();         
    }

    @FXML
    private void addNewMedicineOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/AddNewMedicine.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();   
    }


    @FXML
    private void searchMedicineOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void distributeMedicineOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void generateReportOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/GenerateReport.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();           
    }

    @FXML
    private void setReminderOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void researchProposalOnMouseClick(ActionEvent event) {
    }

    @FXML
    private void addStockOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/AddStock.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();         
    }
    
}
