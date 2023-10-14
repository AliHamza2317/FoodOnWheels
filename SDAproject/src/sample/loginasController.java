package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class loginasController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void AdminLogin(ActionEvent event) throws Exception{
        root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
