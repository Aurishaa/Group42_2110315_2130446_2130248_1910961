/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Distributor;

import Classes.Product;
import Users.Distributor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

public class OrderedProductPieChartController implements Initializable {

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
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList<Product> productView = Distributor.viewOrderHistoryPieChart();
         if (productView != null) {
            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
            for (Product product : productView) {
                pieChartData.add(new PieChart.Data(product.getProductName(), product.getQuantity()));
            }

            orderHistoryPieChart.setData(pieChartData);
         

         }
    }

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) { 
    }
    
}
