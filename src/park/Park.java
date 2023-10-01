package park;

import enums.PARK_STATUS_ENUM;
import enums.SLOT_STATUS_ENUM;
import enums.VEHICLE_TYPE_ENUM;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Park {
    private PARK_STATUS_ENUM parkStatus;
    private static Park park = null;

    private Set<Slot> allSlots;

    private Park(){
        parkStatus = PARK_STATUS_ENUM.OPEN;
        allSlots = new HashSet<>();
        this.createInitialSlots();
    }

    private void createInitialSlots(){
        for(int i=0; i<10; i++){
            Slot twoWheelerSlot = new Slot(i, VEHICLE_TYPE_ENUM.TWO_WHEELER);
            Slot fourWheelerSlot = new Slot(10+i, VEHICLE_TYPE_ENUM.FOUR_WHEELER);

            allSlots.add(twoWheelerSlot);
            allSlots.add(fourWheelerSlot);
        }
    }

    public static Park getParkInstance(){
        if(park==null){
            synchronized (new Object()){
                if(park==null){
                    park = new Park();
                }
            }
        }
        return park;
    }

    public List<Slot> searchAllAvailableSlots(VEHICLE_TYPE_ENUM vehicleTypeEnum){
        System.out.println("Searching for all available slots");
        List<Slot> allAvailableSlots = new ArrayList<>();
        allSlots.stream().forEach(slot -> {
            if(slot.getSlotFor().equals(vehicleTypeEnum) && slot.getSlotStatus().equals(SLOT_STATUS_ENUM.EMPTY)){
                allAvailableSlots.add(slot);
            }
        });
        return allAvailableSlots;
    }
}
