package lab7.weather1;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherView weatherView = new WeatherView();
        WeatherController weatherController = new WeatherController(weatherData, weatherView);

        // Обновление данных о погоде
        weatherController.updateWeather(25.0f, 60.0f);
        weatherController.updateWeather(30.0f, 70.0f);
        weatherController.updateWeather(20.0f, 50.0f);
    }
}