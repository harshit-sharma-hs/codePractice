package DesignPatterns.Practice.Strategy;

public class PayPal implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("PayPal "+amount);
    }
}
