package org.example.lld.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observable {

    private int temparature;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.display();
        }
    }

    public void setTemparature(Integer temparature) {
        this.temparature = temparature;
        notifyObserver();
    }
}
