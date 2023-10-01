package park;

import enums.VEHICLE_TYPE_ENUM;
import vehicle.Vehicle;

public class Ticket {
    private Integer ticketNumber;
    private Integer vehicleNumber;
    private VEHICLE_TYPE_ENUM vehicleType;
    private String customerName;
    private Slot slot;
    private Boolean isPaid;
    private Long parkedAt;
    private Long unParkedAt;
    private Integer billAmount;

    public Ticket(Vehicle vehicle, Slot slot){
        this.ticketNumber = (int) (Math.random()%10000);
        this.vehicleNumber = vehicle.getVehicleNumber();
        this.vehicleType = vehicle.getVehicleType();
        this.customerName = vehicle.getOwnerName();
        this.slot = slot;
        this.parkedAt = 0L;
        this.isPaid = false;
        this.unParkedAt = 0L;
        this.billAmount = 0;
    }

    public Ticket(Integer vehicleNumber, VEHICLE_TYPE_ENUM vehicleType, String customerName, Slot slot) {
        this.ticketNumber = (int) (Math.random()%10000);
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.customerName = customerName;
        this.slot = slot;
        this.parkedAt = 0L;
        this.isPaid = false;
        this.unParkedAt = 0L;
        this.billAmount = 0;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Integer getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VEHICLE_TYPE_ENUM getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VEHICLE_TYPE_ENUM vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public Long getParkedAt() {
        return parkedAt;
    }

    public void setParkedAt(Long parkedAt) {
        this.parkedAt = parkedAt;
    }

    public Long getUnParkedAt() {
        return unParkedAt;
    }

    public void setUnParkedAt(Long unParkedAt) {
        this.unParkedAt = unParkedAt;
    }

    public Integer getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Integer billAmount) {
        this.billAmount = billAmount;
    }
}
