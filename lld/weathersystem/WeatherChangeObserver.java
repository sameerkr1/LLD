package org.example.lld.weathersystem;

public class WeatherChangeObserver implements Observer {

    private Observable observable;
    private int temperature;
    private int humidity;

    WeatherChangeObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Temperature is changed!!");
        this.temperature = observable.getTempareture();
        System.out.println("Temperature: " + temperature);
        this.humidity = humidity;
    }
}
