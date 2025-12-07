package DesignPatterns.Practice.Strategy;

public class CreditCard implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Credit Card "+amount);
    }
}
