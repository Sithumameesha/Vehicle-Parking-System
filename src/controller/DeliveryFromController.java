package controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.tm.DeliveryVehicleTM;
import view.tm.ParkVehicleTM;

import java.io.IOException;
import java.net.URL;

import static controller.ParkInController.parkVehicleTMObservableList;

public class DeliveryFromController {

    public AnchorPane context;
    public JFXButton btnVehicle;
    public JFXButton btnDriver;
    public TableColumn colNumber;
    public TableColumn colType;
    public TableColumn colLeft;
    public TableColumn colDriverName;
    public TableView tblVehicleDelivery;



    public void btnVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource =getClass().getResource("../view/AddVehicleFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void btnDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource =getClass().getResource("../view/AddDriverFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    }

