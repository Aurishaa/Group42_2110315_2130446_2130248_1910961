
package Supplier;



//import Users.Supplier;



import Users.Supplier;

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
import javafx.stage.Stage;



import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;

import javafx.fxml.FXMLLoader;


public class Supplier_InformationController implements Initializable {

    @FXML    private TextField companyNameTextField;
    @FXML    private TextField contactPersonTextField;
    @FXML    private TextField contactNumberTextField;
    @FXML    private TableView<SupplierInformationTable> supplierInfoTableView;
    @FXML    private TableColumn<SupplierInformationTable, String> companyNameTableColumn;
    @FXML    private TableColumn<SupplierInformationTable, String> contactPersonTableColumn;
    @FXML    private TableColumn<SupplierInformationTable, String> contactNumberTableColumn;

//private Supplier supplier;

    
    public Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
   

    //ArrayList<Supplier>supplierList;
    @FXML

    //private Label supplierInfoLabel;

   // private Label supplierInfoLabel;

    
    //private final ObservableList<SupplierInformationTable> supplierData = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // supplierList=new ArrayList<Supplier>();
        
        
        companyNameTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("companyName"));
       contactPersonTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactPerson"));
       contactNumberTableColumn.setCellValueFactory(new PropertyValueFactory<SupplierInformationTable,String>("contactNumber"));
       
      //supplierInfoTableView.setItems(supplierData); 
       
    }    

    @FXML
    private void addButtonMouseOnClicked(ActionEvent event) {
        String companyName=companyNameTextField.getText();
        String contactPerson=contactPersonTextField.getText();
        String contactNumber=contactNumberTextField.getText();
        
        
        //SupplierInformationTable supplierInfo = new SupplierInformationTable(companyName, contactPerson, contactNumber);
        //supplierData.add(supplierInfo);
        
       // supplierList.add(newSupplier);
               
        supplierInfoTableView.getItems().add(new SupplierInformationTable(companyName, contactPerson, contactNumber )
        );
                 
               
                          
        
    }

    @FXML
    private void saveButtonMouseOnClicked(ActionEvent event) {
        String companyName=companyNameTextField.getText();
        String contactPerson=contactPersonTextField.getText();
        String contactNumber=contactNumberTextField.getText();
        
        
       // supplier.supplierInformation(companyName, contactPerson, contactNumber);
       // String supplierInfo = "Company Name: " + companyName + "\n\n"
        //        + "Contact Person: " + contactPerson + "\n\n"
          //      + "Contact Number: " + contactNumber + "\n\n";
        //supplierInfoLabel.setText(supplierInfo);
        //SupplierInformationTable supplierInfo = new SupplierInformationTable(companyName, contactPerson, contactNumber);
        //supplierData.SupplierInformationTable(supplierInfo);
        
    }

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
        String filepath = "Supplier_Dashboard.fxml";

        Parent gotoscene2 = FXMLLoader.load(getClass().getResource(filepath));
        Scene scene = new Scene(gotoscene2);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}

        
