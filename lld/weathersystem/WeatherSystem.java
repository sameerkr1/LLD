package org.example.lld.weathersystem;

import java.util.ArrayList;
import java.util.List;

public class WeatherSystem implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();
    private int temperature;
    private int humidity;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.removeIf(o -> o.equals(observer));
    }

    @Override
    public void notifyObservers(int temperature, int humidity) {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public int getTempareture() {
        return this.temperature;
    }

    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        notifyObservers(temperature, humidity);
    }
}
