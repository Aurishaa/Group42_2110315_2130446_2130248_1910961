/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;
import Common.LoginController;
import Common.SignUpController;
import Classes.Policy;
import Users.ManagingDirector;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;


public class EditPolicyController implements Initializable {

    @FXML
    private TableView<Policy> policyInfoTableView;
    @FXML
    private TableColumn<Policy, String> policyNameTableColumn;
    @FXML
    private TableColumn<Policy, String> policyDetailsTableColumn;
    @FXML
    private TableColumn<Policy, LocalDate> effectiveDateTableColumn;
    @FXML
    private TextArea policyInfoLabel;
        private ManagingDirector managingDirector;
      
      public ManagingDirector getmanagingDirector() {
        return managingDirector;
    }

    public void setmanagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    policyNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("policytitle"));
    policyDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyDetails"));
    effectiveDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyEffectiveDate"));
      
    policyInfoTableView.setItems(ManagingDirector.editPolicy());
    }    

    @FXML
    private void editAndSaveButtonOnClick(ActionEvent event) {
         Policy selectedPolicy = policyInfoTableView.getSelectionModel().getSelectedItem();
    
    if (selectedPolicy != null) {
        String editedDetails = policyInfoLabel.getText();
        
        selectedPolicy.setPolicyDetails(editedDetails);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Policy has been saved successfully.");
        alert.showAndWait();
    }
    }
    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void selectAndViewDetailsButtonOnClick(ActionEvent event) {
            ObservableList<Policy> policyList = ManagingDirector.editPolicy();

          Policy selectedPolicy = policyInfoTableView.getSelectionModel().getSelectedItem();
    
    if (selectedPolicy != null) {
       
        policyInfoLabel.setText(selectedPolicy.getPolicyDetails());
    }
    }

    }
    

