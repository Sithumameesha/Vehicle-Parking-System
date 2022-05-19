package model;

import java.io.IOException;

import static controller.ParkInController.parkVehicleTMObservableList;

public class Bus extends Vehicle{

    int[] busSlot = new int[]{14};

    public Bus() {
        super();
    }

    public Bus(String vehiclenumber, String type, String maxweight, String passenger) {
        super(vehiclenumber, type, maxweight, passenger);
    }

    @Override
    public int park(String vehiclenumber,String vehicletype ) throws IOException {
        L1:
        for (int i: busSlot) {
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
