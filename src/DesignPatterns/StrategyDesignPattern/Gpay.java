package DesignPatterns.StrategyDesignPattern;

public class Gpay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Gpay : "+amount);
    }
}
