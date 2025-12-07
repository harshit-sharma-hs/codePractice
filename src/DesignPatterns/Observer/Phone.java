package DesignPatterns.Observer;

public class Phone implements Observer{
    String weather;
    @Override
    public void updateObserver(String weather) {
        this.weather=weather;
        display();
    }
    void display()
    {
        System.out.println("phone "+weather);
    }
}
