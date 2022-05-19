package model;

public class Driver {
    private String drivername;
    private String nic;
    private String licensenum;
    private String address;
    private String contactnum;

    public Driver() {
    }

    public Driver(String drivername, String nic, String licensenum, String address, String contactnum) {
        this.drivername = drivername;
        this.nic = nic;
        this.licensenum = licensenum;
        this.address = address;
        this.contactnum = contactnum;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLicensenum() {
        return licensenum;
    }

    public void setLicensenum(String licensenum) {
        this.licensenum = licensenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivername='" + drivername + '\'' +
                ", nic='" + nic + '\'' +
                ", licensenum='" + licensenum + '\'' +
                ", address='" + address + '\'' +
                ", contactnum='" + contactnum + '\'' +
                '}';
    }
}
