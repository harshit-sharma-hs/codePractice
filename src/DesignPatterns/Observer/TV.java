package DesignPatterns.Observer;

public class TV implements Observer{
    String weather;
    @Override
    public void updateObserver(String weather) {
        this.weather=weather;
        display();
    }
    void display()
    {
        System.out.println("TV "+weather);
    }
}
