/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

package ManagingDirector;
import Users.SupplyChainManager;
import Classes.Budget;
import Users.ManagingDirector;
import static Users.ManagingDirector.approveBudget;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
//    
//    private SupplyChainManager supplyChainManager;
//
//    public SupplyChainManager getSupplyChainManager() {
//        return supplyChainManager;
//    }
//
//    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
//        this.supplyChainManager = supplyChainManager;
//    }
    

    
    /**
     * Initializes the controller class.
     */
    ObservableList<Budget> budgetList = approveBudget();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     deptTableColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
    amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
    dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));
            
      // ObservableList<Budget> budgetList = approveBudget();
        budgetTableView.setItems(budgetList);
    }
    
    @FXML
    private void approveProposalButtonOnClick(ActionEvent event) {
        
    }

    @FXML
    private void goBackToDashboardOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewDetailsOnButtonClick(ActionEvent event) {
         
          Budget selectedBudget = budgetTableView.getSelectionModel().getSelectedItem();
        if (selectedBudget != null) {
            proposalInfoLabel.setText(selectedBudget.toString());
        }
//    }
    }
    
}
