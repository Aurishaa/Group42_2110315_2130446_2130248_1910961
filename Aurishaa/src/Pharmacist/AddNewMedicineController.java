package Pharmacist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("medicines.bin"))) {
                outputStream.writeObject(medicine);
                System.out.println("Medicine added successfully.");
            } catch (IOException ex) {
                System.out.println("Error adding medicine: " + ex.getMessage());
            }
        } else {
            System.out.println("Please fill in all fields.");
        }
    }
}

