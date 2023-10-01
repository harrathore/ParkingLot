package strategies.billing;

public class TwoWheelerBillStrategy implements BillStrategy{
    @Override
    public Integer generateBillAmount(TicketMetaData ticketMetaData) {
        System.out.println("Generating bill using TwoWheelerBillStrategy");
        return ticketMetaData.getTime()*(2);  // 2 rs per minute
    }
}
