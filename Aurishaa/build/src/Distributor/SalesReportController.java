/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.SalesReport;
import Users.Distributor;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SalesReportController implements Initializable {

    @FXML
    private TextField productNameTextField;
    @FXML
    private TextField quantityTextField;
    @FXML
    private TableView<SalesReport> salesTableView;
    @FXML
    private TableColumn<SalesReport, String> productNameTableColumn;
    @FXML
    private TableColumn<SalesReport, Integer> quantityTableColumn;
    
     Distributor distributor;

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
     
    private ObservableList<SalesReport> reportInfo = FXCollections.observableArrayList();

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          productNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
          quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantitySold"));

    }    

    @FXML
    private void addOnButtonClick(ActionEvent event) {
    String productName = productNameTextField.getText();
    int quantitySold = Integer.parseInt(quantityTextField.getText());

    SalesReport report = new SalesReport(productName, quantitySold);

    reportInfo.add(report);

    salesTableView.setItems(reportInfo);

    Distributor.generateReport(productName, quantitySold);
    }

    @FXML
    private void goToDashboardButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Distributor/DistributorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();

    }

    @FXML
    private void generateReportOnButtonClick(ActionEvent event) {
            
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Sales Report");
        alert.setHeaderText(null);
        alert.setContentText("Sales report has been generated successfully!");
        alert.showAndWait();

    }
    
}
