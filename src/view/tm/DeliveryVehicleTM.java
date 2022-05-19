package view.tm;

public class DeliveryVehicleTM {
    private String vehicleNo;
    private String vehicleType;
    private String driverName;
    private String time;

    public DeliveryVehicleTM() {
    }

    public DeliveryVehicleTM(String vehicleNo, String vehicleType, String driverName, String time) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DeliveryVehicleTM{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", driverName='" + driverName + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

