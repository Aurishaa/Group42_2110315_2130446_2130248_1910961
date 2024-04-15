
package SupplyChainManager;

import Classes.OrdersSCM;
import Classes.SupplierInformationTable;
import Users.SupplyChainManager;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class Provide_OrdersController implements Initializable {

    @FXML    private TextField orderNumberTextField;
    @FXML    private TextField productNameTextField;
    @FXML    private TextField quantityTextField;
    @FXML    private TableView<OrdersSCM> orderInfoTableView;
    @FXML    private TableColumn<OrdersSCM, Integer> orderNumberTableColumn;
    @FXML    private TableColumn<OrdersSCM, String> productTableColumn;
    @FXML    private TableColumn<OrdersSCM, Integer> quantityTableColumn;

    public SupplyChainManager supplyChainManager;

    public SupplyChainManager getSupplyChainManager() {
        return supplyChainManager;
    }

    public void setSupplyChainManager(SupplyChainManager supplyChainManager) {
        this.supplyChainManager = supplyChainManager;
    }
    ObservableList<OrdersSCM> orderInfo = FXCollections.observableArrayList();    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       orderNumberTableColumn.setCellValueFactory(new PropertyValueFactory<OrdersSCM,Integer>("orderNumber"));
       productTableColumn.setCellValueFactory(new PropertyValueFactory<OrdersSCM,String>("product"));
       quantityTableColumn.setCellValueFactory(new PropertyValueFactory<OrdersSCM,Integer>("quantity"));
       
      orderInfoTableView.setItems(orderInfo); 
       
    }     

    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
        String filepath = "/SupplyChainManager/SupplyChainManager_Dashboard.fxml";

        Parent gotoscene2 = FXMLLoader.load(getClass().getResource(filepath));
        Scene scene = new Scene(gotoscene2);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void placeOrderButtonMouseOnClicked(ActionEvent event) {
        int orderNumber = Integer.parseInt(orderNumberTextField.getText());
        String product=productNameTextField.getText();      
        int quantity =Integer.parseInt(quantityTextField.getText());
        
        orderInfoTableView.getItems().add(new OrdersSCM(orderNumber,  product, quantity )
        );
    }

    @FXML
    private void confirmButtonMouseOnClicked(ActionEvent event) {
        int orderNumber = Integer.parseInt(orderNumberTextField.getText());
        String product=productNameTextField.getText();      
        int quantity =Integer.parseInt(quantityTextField.getText());
        
        
        SupplyChainManager.provideOrders(orderNumber,  product, quantity );
        
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Order has been placed successfully.");
        alert.showAndWait();
    }
    
}
