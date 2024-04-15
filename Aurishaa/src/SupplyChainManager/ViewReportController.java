/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainManager;

import Classes.SupplyReport;
import Users.SupplyChainManager;
import static Users.SupplyChainManager.viewReport;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ViewReportController implements Initializable {

    @FXML
    private TableView<SupplyReport> reportInfoTableView;
    @FXML
    private TableColumn<SupplyReport, Integer> reportIdTableColumn;
    @FXML
    private TableColumn<SupplyReport, LocalDate> monthTableColumn;
    @FXML
    private TableColumn<SupplyReport, String> descriptionTableColumn;
public SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
ObservableList<SupplyReport> reportInfo = viewReport();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         reportIdTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyReport,Integer>("reportId"));
         monthTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyReport,LocalDate>("month"));
         descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<SupplyReport,String>("description"));
     

   reportInfoTableView.setItems(reportInfo);

    
    
    }    

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
      Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/SupplyChainManager/SupplyChainManager_Dashboard.fxml"));
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
        alert.setContentText("All the informations has been added.");
        alert.showAndWait();    
      
          
    }
    
}
