/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

package ManagingDirector;
import Users.SupplyChainManager;
import Classes.Budget;
import Users.ManagingDirector;
import static Users.ManagingDirector.approveBudget;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ApproveBudgetController implements Initializable {
 @FXML
     private TableView<Budget> budgetTableView;
    @FXML
    private TableColumn<Budget, String> deptTableColumn;
    @FXML
    private TableColumn<Budget, Integer> amountTableColumn;
    @FXML
    private TableColumn<Budget, LocalDate> dateTableColumn;
    @FXML
    
    
    private Label proposalInfoLabel;
    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }

    

    
    /**
     * Initializes the controller class.
     */
    ObservableList<Budget> budgetList = approveBudget();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     deptTableColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
    amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
    dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));
            
        budgetTableView.setItems(budgetList);
    }
    
    @FXML
    private void approveProposalButtonOnClick(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Budget Approval");
        alert.setHeaderText(null);
        alert.setContentText("Budget has been approved!");

        alert.showAndWait();
        
    }

    @FXML
    private void goBackToDashboardOnButtonClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/ManagingDirector/ManagingDirectorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void viewDetailsOnButtonClick(ActionEvent event) {
         
          Budget selectedBudget = budgetTableView.getSelectionModel().getSelectedItem();
        if (selectedBudget != null) {
            proposalInfoLabel.setText(selectedBudget.toString());
        }

    }
    
}
