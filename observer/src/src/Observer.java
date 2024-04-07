import display.impl.CurrentConditionsDisplay;
import subject.WeatherData;

public class Observer {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 64, 30.4f);
    }

}
