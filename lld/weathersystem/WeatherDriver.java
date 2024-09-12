package org.example.lld.weathersystem;

public class WeatherDriver {
    public static void main(String[] args) {
        WeatherSystem weatherSystem = new WeatherSystem();

        WeatherChangeObserver weatherChangeObserver = new WeatherChangeObserver(weatherSystem);
        weatherSystem.addObserver(weatherChangeObserver);
        weatherSystem.update(100,32);
    }
}
