package strategies.payment;

import enums.PAYMENT_OPTIONS_ENUM;

public class PaymentMetaIno {
    private PAYMENT_OPTIONS_ENUM paymentOption;
    private Integer paymentAmount;
    private Integer accountFrom;
    private Integer accountTo;

    public PaymentMetaIno(PAYMENT_OPTIONS_ENUM paymentOption, Integer paymentAmount) {
        this.paymentOption = paymentOption;
        this.paymentAmount = paymentAmount;
    }

    public PAYMENT_OPTIONS_ENUM getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(PAYMENT_OPTIONS_ENUM paymentOption) {
        this.paymentOption = paymentOption;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Integer accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Integer getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Integer accountTo) {
        this.accountTo = accountTo;
    }
}
