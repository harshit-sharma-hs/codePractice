package DesignPatterns.StrategyDesignPattern;

public class CreditCard implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Credit card : "+ amount );
    }
}
