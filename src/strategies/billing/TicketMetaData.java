package strategies.billing;

import enums.VEHICLE_TYPE_ENUM;

public class TicketMetaData {
    private VEHICLE_TYPE_ENUM vehicleType;
    private Integer time;

    public TicketMetaData(VEHICLE_TYPE_ENUM vehicleType, Integer time) {
        this.vehicleType = vehicleType;
        this.time = time;
    }

    public VEHICLE_TYPE_ENUM getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VEHICLE_TYPE_ENUM vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
