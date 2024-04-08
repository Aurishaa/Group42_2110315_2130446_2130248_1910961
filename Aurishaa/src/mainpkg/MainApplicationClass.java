/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package mainpkg;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplicationClass extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
<<<<<<< Updated upstream
        Parent root = FXMLLoader.load(getClass().getResource("/ManagingDirector/CreatePolicy.fxml"));
=======
        Parent root = FXMLLoader.load(getClass().getResource("/Common/Login.fxml"));
>>>>>>> Stashed changes
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
