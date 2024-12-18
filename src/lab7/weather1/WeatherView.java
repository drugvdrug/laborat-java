package lab7.weather1;

public class WeatherView implements WeatherObserver {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current weather: " + temperature + "°C and " + humidity + "% humidity.");
    }
}