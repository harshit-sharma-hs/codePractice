package DesignPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation =new WeatherStation();
        Phone phone = new Phone();
        TV tv=new TV();
        weatherStation.addObserver(phone);
        weatherStation.addObserver(tv);

        weatherStation.update("Samsung");
    }
}
