package user;

import enums.PAYMENT_OPTIONS_ENUM;
import enums.SLOT_STATUS_ENUM;
import enums.VEHICLE_TYPE_ENUM;
import exception.GenericCustomException;
import park.Ticket;
import strategies.payment.PaymentMetaIno;
import strategies.payment.PaymentMethod;
import strategies.payment.PaymentStrategyManager;
import vehicle.Vehicle;

public class Customer extends User{
    private AdminInterface adminInterface;

    private PaymentStrategyManager paymentStrategyManager;

    private String customerId;

    public Customer(String userName) {
        super(userName);
        this.paymentStrategyManager = PaymentStrategyManager.getPaymentStrategyManager();
        this.adminInterface = AdminInterface.getAdminInterface();
        this.customerId = "cust.id." + String.valueOf(Math.random());
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void performParkingAndPayment(){
        try{

            /**
             * Two wheeler parking
             */
            System.out.println("user wants to book for 2 wheeler");
            for(int i=0; i<11; i++){

                Vehicle vehicle = new Vehicle(1952, this.getUserName(), VEHICLE_TYPE_ENUM.TWO_WHEELER);
                Ticket ticket = adminInterface.parkMyVehicle(vehicle);

                Ticket paidTicket = adminInterface.unParkVehicle(ticket);
                PaymentMetaIno paymentMetaIno = new PaymentMetaIno(PAYMENT_OPTIONS_ENUM.CASH, ticket.getBillAmount());
                PaymentMethod paymentMethod = paymentStrategyManager.decidePaymentStrategy(paymentMetaIno);
                Boolean isPaymentSuccessful = paymentMethod.makePayment(paymentMetaIno);
                if(isPaymentSuccessful){
                    paidTicket.getSlot().setSlotStatus(SLOT_STATUS_ENUM.EMPTY);
                    paidTicket.setPaid(true);
                }else {
                    System.out.println("Please try once again..");
                }
            }

            /**
             * Four wheeler parking
             */

            for(int i=0; i<11; i++){
                Vehicle vehicle2 = new Vehicle(1952, this.getUserName(), VEHICLE_TYPE_ENUM.TWO_WHEELER);
                Ticket ticket2 = adminInterface.parkMyVehicle(vehicle2);

                Ticket paidTicket2 = adminInterface.unParkVehicle(ticket2);
                PaymentMetaIno paymentMetaIno2 = new PaymentMetaIno(PAYMENT_OPTIONS_ENUM.CREDIT_CARD, ticket2.getBillAmount());
                PaymentMethod paymentMethod2 = paymentStrategyManager.decidePaymentStrategy(paymentMetaIno2);
                Boolean isPaymentSuccessful2 = paymentMethod2.makePayment(paymentMetaIno2);
                if(isPaymentSuccessful2){
                    paidTicket2.setPaid(true);
                }else {
                    System.out.println("Please try once again..");
                }
            }

        }catch (GenericCustomException e){
            System.out.println(e.getMessage());
        }

    }
}
