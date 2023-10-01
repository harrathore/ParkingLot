package vehicle;

import enums.VEHICLE_TYPE_ENUM;

public class Vehicle {
    private Integer vehicleNumber;
    private String ownerName;
    private VEHICLE_TYPE_ENUM vehicleType;

    public Vehicle(Integer vehicleNumber, String ownerName, VEHICLE_TYPE_ENUM vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public Integer getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VEHICLE_TYPE_ENUM getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VEHICLE_TYPE_ENUM vehicleType) {
        this.vehicleType = vehicleType;
    }
}
