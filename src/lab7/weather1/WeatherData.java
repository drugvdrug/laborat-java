package lab7.weather1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private float temperature;
    private float humidity;
    private List<WeatherObserver> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
