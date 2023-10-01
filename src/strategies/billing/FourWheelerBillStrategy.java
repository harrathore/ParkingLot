package strategies.billing;

public class FourWheelerBillStrategy implements BillStrategy{
    @Override
    public Integer generateBillAmount(TicketMetaData ticketMetaData) {
        System.out.println("Generating bill using fourWheelerBillStrategy");
        return ticketMetaData.getTime()*(3);   //3 Rs per minute for four wheeler
    }
}
