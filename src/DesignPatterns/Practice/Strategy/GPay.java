package DesignPatterns.Practice.Strategy;

public class GPay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Gpay "+ amount);
    }
}
