package org.example.lld.weathersystem;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(int temperature, int humidity);

    int getTempareture();
}
