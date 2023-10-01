package strategies.payment;

public class CreditCardPaymentMethod implements PaymentMethod{
    @Override
    public Boolean makePayment(PaymentMetaIno paymentMetaIno) {
        System.out.println("Making strategies.payment of " + paymentMetaIno.getPaymentAmount() +
                " through credit card");
        return true;
    }
}
