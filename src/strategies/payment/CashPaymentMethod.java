package strategies.payment;

public class CashPaymentMethod implements PaymentMethod{
    @Override
    public Boolean makePayment(PaymentMetaIno paymentMetaIno) {
        System.out.println("Making strategies.payment of " + paymentMetaIno.getPaymentAmount() +
                " through Cash");
        return true;
    }
}
