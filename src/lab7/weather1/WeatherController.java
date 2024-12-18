package lab7.weather1;

public class WeatherController {
    private WeatherData weatherData;
    private WeatherView weatherView;

    public WeatherController(WeatherData weatherData, WeatherView weatherView) {
        this.weatherData = weatherData;
        this.weatherView = weatherView;
        this.weatherData.registerObserver(weatherView);
    }

    public void updateWeather(float temperature, float humidity) {
        weatherData.setMeasurements(temperature, humidity);
    }
}