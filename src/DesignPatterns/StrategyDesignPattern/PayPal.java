package DesignPatterns.StrategyDesignPattern;

public  class PayPal implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paypal : "+ amount);
    }
}
