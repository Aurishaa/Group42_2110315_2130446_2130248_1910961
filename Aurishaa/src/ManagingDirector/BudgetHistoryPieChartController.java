/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;

import Classes.Budget;
import Users.ManagingDirector;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class BudgetHistoryPieChartController implements Initializable {

    @FXML
    private PieChart budgetHistoryPieChart;
    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           ObservableList<Budget> budgetView = ManagingDirector.viewBudgetDistributionPieChart();

        if (budgetView != null) {
            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
            for (Budget budget : budgetView) {
                pieChartData.add(new PieChart.Data(budget.getDepartment(), budget.getAmount()));
            }

            budgetHistoryPieChart.setData(pieChartData);
            
        }
    }    

    @FXML
    private void goToPreviousSceneButonOnClick(ActionEvent event) {
    }
    
}
