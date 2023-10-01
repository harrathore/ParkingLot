package strategies.billing;

public interface BillStrategy {
    Integer generateBillAmount(TicketMetaData ticketMetaData);
}
