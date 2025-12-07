package DesignPatterns.Practice.Strategy;

public class PaymentContext {
    Payment payment;

    PaymentContext(Payment payment)
    {
        this.payment=payment;
    }
    void setPayment(Payment payment)
    {
        this.payment=payment;
    }
    void performPay(int amount)
    {
        payment.pay(amount);
    }
}
