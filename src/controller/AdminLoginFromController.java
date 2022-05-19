package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminLoginFromController {
    public JFXButton btnLogin;
    public AnchorPane context;
    public TextField txtUserName;
    public PasswordField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
      if (txtUserName.getText().equalsIgnoreCase("Admin") & txtPassword.getText().equals("1234")) {
        URL resource =getClass().getResource("../view/ParkIn.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
       } else {
         new Alert(Alert.AlertType.WARNING, "Please enter the password and username correctly", ButtonType.OK).showAndWait();
      }
    }
}