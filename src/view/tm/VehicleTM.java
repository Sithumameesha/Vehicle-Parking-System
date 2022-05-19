package view.tm;

public class VehicleTM {
     private String vehiclenumber;
     private String type;
     private String maxweight;
     private String passenger;

    public VehicleTM() {
    }

    public VehicleTM(String vehiclenumber, String type, String maxweight, String passenger) {
        this.vehiclenumber = vehiclenumber;
        this.type = type;
        this.maxweight = maxweight;
        this.passenger = passenger;
    }

    public String getVehiclenumber() {
        return vehiclenumber;
    }

    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(String maxweight) {
        this.maxweight = maxweight;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "VehicleTM{" +
                "vehiclenumber='" + vehiclenumber + '\'' +
                ", type='" + type + '\'' +
                ", maxweight='" + maxweight + '\'' +
                ", passenger='" + passenger + '\'' +
                '}';
    }
}