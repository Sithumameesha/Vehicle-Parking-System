package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.VehicleDataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Vehicle;
import view.tm.DeliveryVehicleTM;
import view.tm.ParkVehicleTM;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import static controller.ParkInController.parkVehicleTMObservableList;

public class ParkVehicleFromController {
    public JFXTextField txtVehicleNo;
    public AnchorPane context;
    public JFXTextField txtVehicleType;
    public JFXTextField txtDriverName;
    public JFXTextField ParkingSlot;
    public JFXTextField txtTime;
    public JFXButton btnPark;
    public JFXButton btnDelivery;
    public JFXButton btnManagementLogin;
    public Label txtParking;

    public void initialize() {

        Thread clock = new Thread() {
            public void run() {
                for (; ; ) {
                    DateFormat dateFormat = new SimpleDateFormat("hh:mm ");
                    Calendar cal = Calendar.getInstance();

                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR_OF_DAY);

                    try {
                        String state = null;
                        if (hour >= 12) {
                            state = "PM";
                        } else {
                            state = "AM";
                        }
                        txtTime.setText("" + String.format("%02d", hour) + ":" + String.format("%02d", minute) + " " + state);
                        try {
                            sleep(1000);
                        } catch (InterruptedException ex) {
                            System.out.println(ex);
                        }
                    } catch (NullPointerException e) {
                        System.out.println(e);
                    }
                }
            }
        };
        clock.start();
    }

    public void btnParkOnAction(ActionEvent actionEvent) {
        try {

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm a");
            ParkVehicleTM parkVehicleTM = new ParkVehicleTM(
                    txtVehicleNo.getText(),
                    txtVehicleType.getText(),
                    Integer.parseInt(ParkingSlot.getText()),
                    LocalDateTime.now().format(dateTimeFormatter));
            parkVehicleTMObservableList.add(parkVehicleTM);
        } catch (NumberFormatException e) {

        }

    }

    public void btnDeliveryOnAction(ActionEvent actionEvent) throws IOException {


    }


    public void btnMangementLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLoginFrom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void txtSearchOnAction(ActionEvent actionEvent) {

        search();
        for (Vehicle vehicle : VehicleDataBase.vehicletable) {
            try {
                ParkingSlot.setText(vehicle.park(vehicle.getVehiclenumber(), vehicle.getType()) + "");
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

    private void search() {
        for (Vehicle temp : VehicleDataBase.vehicletable
        ) {
            if (temp.getVehiclenumber().equals(txtVehicleNo.getText())) {
                txtVehicleType.setText(temp.getType());
                return;
            }
        }
        new Alert(Alert.AlertType.WARNING, "Empty Set").show();
    }
}

