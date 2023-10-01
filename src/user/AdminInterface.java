package user;

import enums.SLOT_STATUS_ENUM;
import strategies.billing.BillStrategy;
import strategies.billing.BillStrategyManger;
import strategies.billing.TicketMetaData;
import exception.GenericCustomException;
import park.Park;
import park.Slot;
import park.Ticket;
import vehicle.Vehicle;

import java.util.List;

public class AdminInterface {
    private Park park;

    private BillStrategyManger billStrategyManger;

    private static AdminInterface adminInterface = new AdminInterface();

    private AdminInterface(){
        park = Park.getParkInstance();
        billStrategyManger = BillStrategyManger.getBillStrategyManger();
    }

    public static AdminInterface getAdminInterface(){
        return adminInterface;
    }

    public Ticket parkMyVehicle(Vehicle vehicle) throws GenericCustomException{
        System.out.println("Trying to book for " + vehicle.getVehicleType());
        List<Slot> allAvailableSlots = park.searchAllAvailableSlots(vehicle.getVehicleType());
        if(allAvailableSlots.size()==0){
            throw new GenericCustomException("Sorry, There is no slots available !");
        }
        System.out.println("All available slots are " + allAvailableSlots.size());
        allAvailableSlots.get(0).setSlotStatus(SLOT_STATUS_ENUM.OCCUPIED);
        Ticket ticket = new Ticket(vehicle, allAvailableSlots.get(0));
        return ticket;
    }

    public Ticket unParkVehicle(Ticket ticket){
        Long unParkingAt = 200L;
        ticket.setUnParkedAt(unParkingAt);
        TicketMetaData ticketMetaData = new TicketMetaData(ticket.getVehicleType(),
                Math.toIntExact(unParkingAt - ticket.getParkedAt()));
        BillStrategy billStrategy = billStrategyManger.decidePaymentStrategy(ticketMetaData);
        Integer billAmount = billStrategy.generateBillAmount(ticketMetaData);
        ticket.setBillAmount(billAmount);
        return ticket;
    }
}
