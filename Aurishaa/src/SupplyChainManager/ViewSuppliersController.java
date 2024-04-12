
package SupplyChainManager;

import Supplier.SupplierInformationTable;
import Users.SupplyChainManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class ViewSuppliersController implements Initializable {
    private SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
      

    @FXML
    private TableView<SupplierInformationTable> supplierInfoTableView;
    @FXML
    private TableColumn<SupplierInformationTable, String> companyNameTableColumn;
    @FXML
    private TableColumn<SupplierInformationTable, String> contactPersonTableColumn;
    @FXML
    private TableColumn<SupplierInformationTable, String> contactNumberTableColumn;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         companyNameTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("companyName"));
       contactPersonTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactPerson"));
             contactNumberTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactNumber"));
     {
    ObservableList<SupplierInformationTable> supplierData = SupplyChainManager.viewSuppliers(String companyName, String contactPerson,String contactNumber);

    XYChart.Series<String, Integer> series = new XYChart.Series<>();
    for (Bill bill : billList) {
        series.getData().add(new XYChart.Data<String, Integer>(Integer.toString(bill.getPatientId()), bill.getTotalDue()));

    }

    BillBarChart.getData().add(series);
}
    
    
    }    

    @FXML
    private void viewSuppliersButtonMouseOnClicked(ActionEvent event) {
            
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("EmpObjects.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Supplier sup;
            try{
                supplierInfoTableView.setItem("");
                while(true){
                    System.out.println("Printing objects.");
                    sup = (Supplier)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    sup.supplierInformation();
                    System.out.println(sup.toString());
                    supplierInfoTableView.appendText(sup.toString());
                }
            }//end of nested try
            catch(Exception e){
                // handling code
            }//nested catch     
            supplierInfoTableView.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } 
        finally {
            try {
                
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           
    }

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event)  throws IOException {
        String filepath = "SupplyChainManager_Dashboard.fxml";

        Parent gotoscene2 = FXMLLoader.load(getClass().getResource(filepath));
        Scene scene = new Scene(gotoscene2);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
