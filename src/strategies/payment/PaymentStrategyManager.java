package strategies.payment;

import enums.PAYMENT_OPTIONS_ENUM;

public class PaymentStrategyManager {
    private static PaymentStrategyManager paymentStrategyManager=null;

    private PaymentStrategyManager(){
    }

    public static PaymentStrategyManager getPaymentStrategyManager(){
        if(paymentStrategyManager==null){
            synchronized (new Object()){
                if(paymentStrategyManager==null){
                    paymentStrategyManager = new PaymentStrategyManager();
                }
            }
        }
        return paymentStrategyManager;
    }

    public PaymentMethod decidePaymentStrategy(PaymentMetaIno paymentMetaIno){
        if(paymentMetaIno.getPaymentOption().equals(PAYMENT_OPTIONS_ENUM.UPI)){
            return new UPIPaymentMethod();
        }else if(paymentMetaIno.getPaymentOption().equals(PAYMENT_OPTIONS_ENUM.CREDIT_CARD)){
            return new CreditCardPaymentMethod();
        }else{
            return new CashPaymentMethod();
        }
    }
}
