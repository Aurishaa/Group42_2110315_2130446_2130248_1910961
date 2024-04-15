/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Common;

import Users.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private DatePicker dobDatePicker;
    @FXML
    private ComboBox<String> userTypeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         userTypeComboBox.getItems().addAll(
                "Managing Director",
                "Distributor",
                "Supplier",
                "Supply Chain Manager",
                "Pharmacist",
                "Quality Control Manager",
                "Production Manager",
                "Marketing Manager");
    }    

    @FXML
    private void signUpButtonMouseOnClicked (ActionEvent event) throws FileNotFoundException, IOException {{
         
        if(userTypeComboBox.getValue().equals("Managing Director")){
            managingDirectorAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();                                         
        }   
        else if(userTypeComboBox.getValue().equals("Distributor")){
            distributorAndShow(); 
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Supplier")){
            supplierAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Supply Chain Manager")){
            supplyChainManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Pharmacist")){
            pharmacistAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Quality Control Manager")){
            qualityControlManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Production Manager")){
            productionManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Marketing Manager")){
            marketingManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else {
            Alert a2 = new Alert(Alert.AlertType.WARNING);
            a2.setTitle("Warning ");
            a2.setHeaderText("LogIn Failed");
            a2.setContentText("Wrong ID/Password. Please Try Again");
            a2.showAndWait();
        }
 }     
       
    

    
    
    
    }
    @FXML
    private void backButtonMouseOnClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    private void managingDirectorAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
      User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("ManagingDirector.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    

    private void distributorAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
      User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Distributor.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    

    private void supplierAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
      User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Supplier.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    

    private void supplyChainManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("SupplyChainManager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    

    private void pharmacistAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Pharmacist.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    

    private void qualityControlManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
      User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("QualityControlManager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    

    private void productionManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
      User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("ProductionManager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    

    private void marketingManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || idTextField.getText().isEmpty() 
                ||emailTextField.getText().isEmpty()
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null )
                                      
                {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(idTextField.getText()),
                    passwordTextField.getText(),
                    emailTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
                    
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("MarketingManager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(SignUpController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
}