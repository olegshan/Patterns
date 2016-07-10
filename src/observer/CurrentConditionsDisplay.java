package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Bors on 09.07.2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;
//    private Subject weatherData;

    /*public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }*/

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData w = (WeatherData) o;
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
            this.pressure = w.getPressure();
            display();
        }
    }

    /*@Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }*/

    @Override
    public void display() {
        System.out.println("Temperature: " + temperature + ",\n pressure: " + pressure + ",\n humidity: " + humidity);
    }

}
