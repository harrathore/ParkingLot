package strategies.payment;

public class UPIPaymentMethod implements PaymentMethod{
    @Override
    public Boolean makePayment(PaymentMetaIno paymentMetaIno) {
        System.out.println("Making strategies.payment of " + paymentMetaIno.getPaymentAmount()
                           + "through UPI");
        return true;
    }
}
