package park;

import enums.SLOT_STATUS_ENUM;
import enums.VEHICLE_TYPE_ENUM;

public class Slot {
    private Integer slotNumber;
    private SLOT_STATUS_ENUM slotStatus;
    private VEHICLE_TYPE_ENUM slotFor;

    public Slot(Integer slotNumber, VEHICLE_TYPE_ENUM slotFor) {
        this.slotNumber = slotNumber;
        this.slotStatus = SLOT_STATUS_ENUM.EMPTY;
        this.slotFor = slotFor;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public SLOT_STATUS_ENUM getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SLOT_STATUS_ENUM slotStatus) {
        this.slotStatus = slotStatus;
    }

    public VEHICLE_TYPE_ENUM getSlotFor() {
        return slotFor;
    }

    public void setSlotFor(VEHICLE_TYPE_ENUM slotFor) {
        this.slotFor = slotFor;
    }
}
