package DesignPatterns.Practice.Strategy;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext =new PaymentContext(new PayPal());
        int amount=100;
        paymentContext.performPay(amount);
        paymentContext.setPayment(new GPay());
        paymentContext.performPay(amount);
        paymentContext.setPayment(new CreditCard());
        paymentContext.performPay(amount);
    }
}
