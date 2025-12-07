package DesignPatterns.StrategyDesignPattern;

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
    void perform(int amount)
    {
        payment.pay(amount);
    }
}
