/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Common;

import Users.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LoginController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField pwPasswordField;
    @FXML
    private ComboBox<String> userComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userComboBox.getItems().addAll(
                "Managing Director",
                "Distributor",
                "Pharmacist",
                "Quality Control Manager",
                "Supplier",
                " Supply Chain Manager",
                "Production Manager",
                "Finance Manager");
    }    
     

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
     if(userComboBox.getValue().equals("Managing Director")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("ManagingDirector.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("/ManagingDirector/ManagingDirectorDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        //Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userComboBox.getValue().equals("Distributor")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Distributor.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("/Distributor/DistributorDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                       // Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userComboBox.getValue().equals("Supplier")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Supplier.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("/Supplier/Supplier_Dashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        //Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userComboBox.getValue().equals("Supply Chain Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("SupplyChainManager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("SupplyChainManagerdashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        //Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userComboBox.getValue().equals("Pharmacist")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Pharmacist.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("/Pharmacist/PharmacistScene.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                       // Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userComboBox.getValue().equals("Quality Control Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("QualityControlManager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("QualityControlManagerDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                       // Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userComboBox.getValue().equals("Production Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("ProductionManager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("ProductionManagerDashboard.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        //Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }
        if(userComboBox.getValue().equals("Finance Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("FinanceManager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(pwPasswordField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("FinanceManagerDashboardScene.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    } else {
                       // Alert();
                        }
                    
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
    }

    
    }

    @FXML
    private void signUpButtonOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
        
    
    
}
