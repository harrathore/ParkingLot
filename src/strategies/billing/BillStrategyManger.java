package strategies.billing;

import enums.VEHICLE_TYPE_ENUM;

public class BillStrategyManger {
    private static BillStrategyManger billStrategyManger = new BillStrategyManger();
    private BillStrategyManger(){

    }
    public static BillStrategyManger getBillStrategyManger(){
        return billStrategyManger;
    }

    public BillStrategy decidePaymentStrategy(TicketMetaData ticketMetaData){
        System.out.println("Deciding the payment strategy");
        if(ticketMetaData.getVehicleType().equals(VEHICLE_TYPE_ENUM.TWO_WHEELER)){
            return new TwoWheelerBillStrategy();
        }else{
            return new FourWheelerBillStrategy();
        }
    }
}
