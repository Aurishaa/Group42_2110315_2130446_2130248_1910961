/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.Product;
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
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;



public class OrderHistoryPieChartController implements Initializable {

    @FXML
    private PieChart orderHistoryPieChart;

    
  

    private Distributor distributor;

    public Distributor getDistributor() {
        return distributor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }
    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
         ObservableList<Product> productView = Distributor.viewOrderHistory();

        if (productView != null) {
            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
            for (Product product : productView) {
                pieChartData.add(new PieChart.Data(product.getProductName(), product.getQuantity()));
            }

            orderHistoryPieChart.setData(pieChartData);
            
        }
    }

    public void goToPreviousSceneButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Distributor/More.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
