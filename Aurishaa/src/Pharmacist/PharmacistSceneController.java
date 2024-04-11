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
    private Button checkStockButton;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dashboardOnMouseClick(ActionEvent event) {
        // Your code for handling dashboard button click
    }

    @FXML
    private void leaveRequestOnMouseClick(ActionEvent event) {
        // Your code for handling leave request button click
    }

    @FXML
    private void addNewMedicineOnMouseClick(ActionEvent event) throws IOException{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/AddNewMedicine.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void checkStockOnMouseClick(ActionEvent event) {
        // Your code for handling check stock button click
    }

    @FXML
    private void searchMedicineOnMouseClick(ActionEvent event) {
        // Your code for handling search medicine button click
    }

    @FXML
    private void distributeMedicineOnMouseClick(ActionEvent event) {
        // Your code for handling distribute medicine button click
    }

    @FXML
    private void generateReportOnMouseClick(ActionEvent event) {
        // Your code for handling generate report button click
    }

    @FXML
    private void setReminderOnMouseClick(ActionEvent event) {
        // Your code for handling set reminder button click
    }

    @FXML
    private void researchProposalOnMouseClick(ActionEvent event) {
        // Your code for handling research proposal button click
    }
}
