package DesignPatterns.StrategyDesignPattern;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        PaymentContext paymentContext = new PaymentContext(new PayPal());
        int amount =100;
        paymentContext.perform(amount);
        Thread.sleep(2000);
        paymentContext.setPayment(new CreditCard());
        paymentContext.perform(amount);
        Thread.sleep(2000);
        paymentContext.setPayment(new Gpay());
        paymentContext.perform(amount);

    }



}
