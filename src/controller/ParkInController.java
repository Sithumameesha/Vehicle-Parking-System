package controller;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.tm.ParkVehicleTM;

import java.io.IOException;
import java.net.URL;

public class ParkInController {
    public static ObservableList<ParkVehicleTM>parkVehicleTMObservableList= FXCollections.observableArrayList();
    public JFXButton btnVehicle;
    public JFXButton btnDriver;
    public TableColumn colNumber;
    public TableColumn colType;
    public TableColumn colSlot;
    public TableColumn colTime;
    public JFXButton btnDelivery;
    public AnchorPane context;
    public TableView tblVehicle;
    public Button btnHome;

    public void initialize(){
        colNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNo"));
        colType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        colSlot.setCellValueFactory(new PropertyValueFactory<>("parkingSlot"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("Time"));
        tblVehicle.setItems(parkVehicleTMObservableList);
    }

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


    public void btnDeliveryOnAction(ActionEvent actionEvent) throws IOException {
        URL resource =getClass().getResource("../view/DeliveryFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource =getClass().getResource("../view/ParkVehicleFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }

}
