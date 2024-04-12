package Pharmacist;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.cell.PropertyValueFactory;

public class GenerateReportController implements Initializable {

    @FXML
    private TableView<DummyMedicine> medicineReportTV;
    @FXML
    private TableColumn<DummyMedicine,String> medicineNameTC;
    @FXML
    private TableColumn<DummyMedicine,String> componentTC;
    @FXML
    private TextField medicineTextField;
    @FXML
    private TextField componentTextField;

    private final ObservableList<DummyMedicine> medData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        medicineReportTV.setItems(medData);
        medicineNameTC.setCellValueFactory(new PropertyValueFactory<DummyMedicine,String>("MedicineName"));
        componentTC.setCellValueFactory(new PropertyValueFactory<DummyMedicine,String>("Components"));
    }



    @FXML
    private void generateReportOnMouseClick(ActionEvent event) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("report.bin"))) {
            // Write each DummyMedicine object from the medicineData list to the file
            for (DummyMedicine medicine : medData) {
                outputStream.writeObject(medicine.getMedicineName());
                outputStream.writeObject(medicine.getComponents());
            }
            System.out.println("Report generated successfully.");
        } catch (IOException ex) {
            System.out.println("Error generating report: " + ex.getMessage());
        }
    }

    @FXML
    private void addToTableOnMouseClick(ActionEvent event) {
        String medicineName = medicineTextField.getText();
        String components = componentTextField.getText();
        if (!medicineName.isEmpty() && !components.isEmpty()) {
            medData.add(new DummyMedicine(medicineName, components));
            medicineTextField.clear();
            componentTextField.clear();
        }
    }

    @FXML
    private void clearTableOnMouseClick(ActionEvent event) {
        medData.clear();
    }
}
