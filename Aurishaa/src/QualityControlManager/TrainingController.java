/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package QualityControlManager;

import java.io.File;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jupit
 */
public class TrainingController implements Initializable {

    @FXML
    private TextField trainingTextField;
    @FXML
    private TextField reasonTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnMouseClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/QualityControlManager/QCMScene.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void addButtonOnMouseClick(ActionEvent event) {
    String training = trainingTextField.getText();
    String reason = reasonTextField.getText();

    if (training.isEmpty() || reason.isEmpty()) {
        System.err.println("Both fields must be filled.");
        return;
    }


    String fileName = "Training.bin";
    
    try {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(training);
            oos.writeObject(reason);
            System.out.println("Bin file created successfully: " + fileName);
        }
    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Error occurred while creating bin file.");
    }
}
    
}
