package Pharmacist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddNewMedicineController implements Initializable {

    @FXML
    private TextField nameMedicineTextField;
    @FXML
    private TextField quantityMedicineTextField;
    @FXML
    private TextField expirationDateTextField;
    @FXML
    private Button addMedicineButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addMedicineOnMouseClick(ActionEvent event) {
        String name = nameMedicineTextField.getText();
        String quantity = quantityMedicineTextField.getText();
        String expirationDate = expirationDateTextField.getText();

        if (!name.isEmpty() && !quantity.isEmpty() && !expirationDate.isEmpty()) {
            Medicine medicine = new Medicine(name, Integer.parseInt(quantity), expirationDate);

            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Medicine.bin"))) {
                outputStream.writeObject(medicine);
                System.out.println("Medicine added successfully.");
            } catch (IOException ex) {
                System.out.println("Error adding medicine: " + ex.getMessage());
            }
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Pharmacist/PharmacistScene.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();        
    }
}