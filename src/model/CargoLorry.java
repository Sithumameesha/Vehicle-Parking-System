package model;

import java.io.IOException;

import static controller.ParkInController.parkVehicleTMObservableList;

public class CargoLorry extends Vehicle{
    int[] cargoLorrySlot = new int[]{5,6,7,8,9,10,11};

    public CargoLorry() {
        super();
    }

    public CargoLorry(String vehiclenumber, String type, String maxweight, String passenger) {
        super(vehiclenumber, type, maxweight, passenger);
    }

    @Override
    public int park(String vehiclenumber,String vehicletype ) throws IOException {
        L1:
        for (int i: cargoLorrySlot) {
            if(parkVehicleTMObservableList.size()==0){
                return i;
            }else{
                L2:
                for (int j=0; j< parkVehicleTMObservableList.size(); j++){
                    if(parkVehicleTMObservableList.get(j).getParkingSlot() == i){
                        continue L1;
                    }else{
                        if(j != parkVehicleTMObservableList.size() -1){
                            continue L2;
                        }else{
                            return i;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
