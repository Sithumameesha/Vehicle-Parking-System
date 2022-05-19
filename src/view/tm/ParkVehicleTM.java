package view.tm;

public class ParkVehicleTM {
      private String vehicleNo;
      private String vehicleType;
      private Integer parkingSlot;
      private String time;

    public ParkVehicleTM() {
    }

    public ParkVehicleTM(String vehicleNo, String vehicleType, Integer parkingSlot, String time) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
        this.time = time;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Integer parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ParkVehicleTM{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", parkingSlot=" + parkingSlot +
                ", time='" + time + '\'' +
                '}';
    }
}