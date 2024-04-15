/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;
import Classes.SalesReport;
import Users.ManagingDirector;
import java.io.IOException;
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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class ViewSalesReportController implements Initializable {

    @FXML
    private BarChart< String,Number> salesBarChart;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;

    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void viewSalesReportOnButtonClick(ActionEvent event) {

    ObservableList<SalesReport> reportInfo = ManagingDirector.viewSalesReport();

    salesBarChart.getData().clear();

    XYChart.Series<String, Number> series = new XYChart.Series<>();
    for (SalesReport report : reportInfo) {
        series.getData().add(new XYChart.Data<>(report.getProductName(), report.getQuantitySold()));
    }
    salesBarChart.getData().add(series);

}

    

    @FXML
    private void goToDashBoardOnButtonClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/ManagingDirector/ManagingDirectorDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
    
}

