package Pharmacist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class AddStockController implements Initializable {

    @FXML
    private TextField firstSNTextField;
    @FXML
    private TextField secondSNTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addStockOnButtonClick(ActionEvent event) {
        String firstStockName = firstSNTextField.getText().trim();
        String secondStockName = secondSNTextField.getText().trim();

        if (!firstStockName.isEmpty() || !secondStockName.isEmpty()) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("stocks.bin"))) {
                if (!firstStockName.isEmpty()) {
                    outputStream.writeObject(firstStockName);
                }
                if (!secondStockName.isEmpty()) {
                    outputStream.writeObject(secondStockName);
                }
                System.out.println("Stock(s) added successfully.");
            } catch (IOException ex) {
                System.out.println("Error adding stock(s): " + ex.getMessage());
            }
        } else {
            System.out.println("Please enter at least one stock name.");
        }
    }
}
