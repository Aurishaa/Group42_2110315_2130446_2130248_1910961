
package SupplyChainManager;
import Classes.Budget;
import Users.SupplyChainManager;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class BudgetApprovalRequestController implements Initializable {
    private SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
      
    @FXML
    private DatePicker requestDatePicker;
    @FXML
    private TextField departmentTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private Label budgetInfoLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showAndSubmitButtonMouseOnClicked(ActionEvent event) {
        String department = departmentTextField.getText();
        int amount =Integer.parseInt(amountTextField.getText());
        LocalDate requestDate = requestDatePicker.getValue();
        if (department == null || amount<=0 || requestDate == null) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the required fields.");
        alert.showAndWait();
        return;
   
        
}

        SupplyChainManager.requestBudget(department, amount , requestDate);
    
        String budgetInfo = "Name of Department: " + department + "\n\n"
                + "Amount for Budget: " + amount + "\n\n"
                + "Date of Request: " + requestDate + "\n\n";
        budgetInfoLabel.setText(budgetInfo);
        System.out.println("Successful");
       
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("New budget has been created successfully.");
        alert.showAndWait();
    
    
    }   

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/SupplyChainManager/SupplyChainManager_Dashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
}
