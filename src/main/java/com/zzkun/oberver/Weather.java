package com.zzkun.oberver;

import java.util.Observable;

/**
 * Created by kun on 2016/3/16.
 */
public class Weather extends Observable {

    private double temperature;
    private double airQuality;
    private double pressure;

    public Weather(double temperature, double airQuality, double pressure) {
        this.temperature = temperature;
        this.airQuality = airQuality;
        this.pressure = pressure;
        measurementsChanged();
    }


    public void setWeather(double temperature, double airQuality, double pressure) {
        this.temperature = temperature;
        this.airQuality = airQuality;
        this.pressure = pressure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getAirQuality() {
        return airQuality;
    }

    public double getPressure() {
        return pressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public void setAirQuality(double airQuality) {
        this.airQuality = airQuality;
        measurementsChanged();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }
}
