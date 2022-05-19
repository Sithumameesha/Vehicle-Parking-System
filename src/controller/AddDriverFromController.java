package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.DriverDataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Driver;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;

public class AddDriverFromController {
    public JFXButton btnAdd;
    public JFXTextField txtDriverName;
    public JFXTextField txtNic;
    public JFXTextField txtDriverLisense;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public Button btnHome;
    public AnchorPane context;
    public Button btnBack;

    public void btnAddOnAction(ActionEvent actionEvent) {
        Driver driver = new Driver(
                txtDriverName.getText(),
                txtNic.getText(),
                txtDriverLisense.getText(),
                txtAddress.getText(),
                txtContact.getText()

        );
        if (DriverDataBase.drivertable.add(driver)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Added...").show();
        }else{
            new Alert(Alert.AlertType.ERROR, "Something Went Wrong...").show();
        }

       ClearField();
    }

    private void ClearField() {
        txtDriverName.setText("");
                txtNic.setText("");
                txtDriverLisense.setText("");
                txtAddress.setText("");
                txtContact.setText("");
    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource =getClass().getResource("../view/ParkVehicleFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        URL resource =getClass().getResource("../view/ParkIn.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
