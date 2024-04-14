
package Supplier;

import Classes.OrdersSCM;
import Classes.Task;
import Users.Supplier;
import static Users.Supplier.viewIncomingOrders;
import static Users.Supplier.viewTask;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ViewTaskController implements Initializable {
    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    

    @FXML
    private Label taskInfoLabel;

    ObservableList<Task> TaskInfo = Supplier.viewTask();
    ObservableList<Task> viewTask = Supplier.viewTask();
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        ObservableList<Task> viewTask = Supplier.viewTask();
    StringBuilder sb = new StringBuilder();
    for (Task task : TaskInfo) {
        sb.append(task.toString()).append("\n");
    }
    taskInfoLabel.setText(sb.toString());
}    

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
    Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Supplier/Supplier_Dashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void okButtonMouseOnClicked(ActionEvent event) {
     Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("All the tasks has been shown.");
        alert.showAndWait(); 
    }
    
}
