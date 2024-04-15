/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package QualityControlManager;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class GenerateReportController implements Initializable {

    @FXML
    private TableView<Report> ReportTV;
    @FXML
    private TableColumn<Report, String> ReportTypeTC;
    @FXML
    private TableColumn<Report, String> ReasonTC;
    @FXML
    private TextField reportTypeTextField;
    @FXML
    private TextField reasonTextField;
    private final ObservableList<Report> repdata = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ReportTV.setItems(repdata);
        ReportTypeTC.setCellValueFactory(new PropertyValueFactory<Report,String>("Report Type"));
        ReasonTC.setCellValueFactory(new PropertyValueFactory<Report,String>("Reason"));        
        // TODO
    }    

    @FXML
    private void generateReportOnMouseClick(ActionEvent event) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("GeneratedReport.bin"))) {
            // Write each DummyMedicine object from the medicineData list to the file
            for (Report i : repdata) {
                outputStream.writeObject(i.getReport());
                outputStream.writeObject(i.getReason());
            }
            System.out.println("Report generated successfully.");
        } catch (IOException ex) {
            System.out.println("Error generating report: " + ex.getMessage());
        }
    }

    @FXML
    private void addToTableOnMouseClick(ActionEvent event) {
        String Report = reportTypeTextField.getText();
        String Reason = reasonTextField.getText();
        if (!Report.isEmpty() && !Reason.isEmpty()) {
            repdata.add(new Report(Report, Reason));
            reportTypeTextField.clear();
            reasonTextField.clear();
        }
    }

    @FXML
    private void clearTableOnMouseClick(ActionEvent event) {
        repdata.clear();
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/QualityControlManager/QCMScene.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
