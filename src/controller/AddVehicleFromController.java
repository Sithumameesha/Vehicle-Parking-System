package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.DriverDataBase;
import db.VehicleDataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Bus;
import model.CargoLorry;
import model.Van;
import model.Vehicle;
import view.tm.VehicleTM;

import java.io.IOException;
import java.net.URL;

import static db.VehicleDataBase.vehicletable;

public class AddVehicleFromController {
    public JFXButton btnAdd;
    public JFXTextField txtNum;
    public JFXTextField txtType;
    public JFXTextField txtPassenger;
    public JFXTextField txtWeight;
    public JFXButton btnHome;
    public AnchorPane context;
    public JFXButton btnBack;
    public JFXButton btnNew;


    public void btnAddOnAction(ActionEvent actionEvent) {
        if (btnAdd.getText().equals("Add")){
            if(txtType.getText().equals("Van")) {
                    Van van = new Van(txtNum.getText(), txtType.getText(), txtWeight.getText(), txtPassenger.getText());
                  if ( vehicletable.add(van)) {
                      new Alert(Alert.AlertType.CONFIRMATION, "Added...").show();
                  }else {
                      new Alert(Alert.AlertType.ERROR, "Some Things Went Wrong...").show();

                  }

            }

        }
       

        if (btnAdd.getText().equals("Add")){
            if(txtType.getText().equals("Bus")) {
                Bus bus = new Bus(txtNum.getText(), txtType.getText(), txtWeight.getText(), txtPassenger.getText());
                if ( vehicletable.add(bus)) {
                    new Alert(Alert.AlertType.CONFIRMATION, "Added...").show();
                }else {
                    new Alert(Alert.AlertType.ERROR, "Some Things Went Wrong...").show();

                }



            }

        }


        if (btnAdd.getText().equals("Add")){
            if(txtType.getText().equals("CargoLorry")) {
                CargoLorry cargoLorry = new CargoLorry(txtNum.getText(), txtType.getText(), txtWeight.getText(), txtPassenger.getText());
                if ( vehicletable.add(cargoLorry)) {
                    new Alert(Alert.AlertType.CONFIRMATION, "Added...").show();
                }else {
                    new Alert(Alert.AlertType.ERROR, "Some Things Went Wrong...").show();

                }



            }

        }

    }

    private void clear() {
        txtNum.setText("");
        txtType.setText("");
        txtPassenger.setText("");
        txtWeight.setText("");
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

    public void btnNewOnAction(ActionEvent actionEvent) {
        clear();
    }
}
