package com.jdp.observer;

/**
 * @author Leon
 */
public class App {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10, 39, 23);

        weatherData.measurementsChanged();

    }
}
