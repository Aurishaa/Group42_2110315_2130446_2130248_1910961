/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ManagingDirector;

import Users.ManagingDirector;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class CreateOrEditPolicyController implements Initializable {
    private ManagingDirector managingDirector;

    public ManagingDirector getManagingDirector() {
        return managingDirector;
    }

    public void setmanagingDirector(ManagingDirector managingDirector) {
        this.managingDirector = managingDirector;
    }
    
    @FXML
    private RadioButton createPolicyRadioButton;
    @FXML
    private RadioButton editPolicyRadioButton;
    ToggleGroup tg;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg= new ToggleGroup();
        createPolicyRadioButton.setToggleGroup(tg);
        editPolicyRadioButton.setToggleGroup(tg);
    }    

    @FXML
    private void goToNextSceneButtonOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
    Parent mainSceneParent = null;
    if (createPolicyRadioButton.isSelected()) {
        loader.setLocation(getClass().getResource("/ManagingDirector/CreatePolicy.fxml"));
        mainSceneParent = loader.load();
    } else if (editPolicyRadioButton.isSelected()) {
        loader.setLocation(getClass().getResource("/ManagingDirector/EditPolicy.fxml"));
        mainSceneParent = loader.load();
    }
    
   if (mainSceneParent != null) {
    if (createPolicyRadioButton.isSelected()) { 
        CreatePolicyController controller = loader.getController();
        controller.setmanagingDirector(managingDirector);
    } else if (editPolicyRadioButton.isSelected()) {
        EditPolicyController controller = loader.getController();
        controller.setmanagingDirector(managingDirector);
    }

    Scene scene1 = new Scene(mainSceneParent);
    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
    window.setScene(scene1);
    window.show(); 
}
}
    

    @FXML
    private void goBackToDashboardButtonOnClick(ActionEvent event) {
    }
    
}
