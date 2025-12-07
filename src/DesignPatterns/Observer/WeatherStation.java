package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> list=new ArrayList<>();
    String weather;
    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void update(String weather) {
        this.weather=weather;
        updateAll();
    }
    void updateAll()
    {
        for (Observer observer:list)
            observer.updateObserver(weather);
    }
}
