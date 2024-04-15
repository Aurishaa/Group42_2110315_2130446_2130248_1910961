/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;

import Classes.Budget;
import Users.ManagingDirector;
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
           ObservableList<Budget> budgetView = ManagingDirector.viewBudgetDistribution();

        if (budgetView != null) {
            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
            for (Budget budget : budgetView) {
                pieChartData.add(new PieChart.Data(budget.getDepartment(), budget.getAmount()));
            }

            budgetHistoryPieChart.setData(pieChartData);
            
        }
    }    

    @FXML
    private void goToPreviousSceneButonOnClick(ActionEvent event) throws IOException {
         Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/ManagingDirector/More.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
