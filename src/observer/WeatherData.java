package observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Bors on 09.07.2016.
 */

// interface Subject was our implementation. Now we replace it with Java standart implementation —
// by extending Observable class
public class WeatherData extends Observable /*implements Subject*/ {

//    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
//        observers = new ArrayList();
    }

    /*@Override
    public void registerObserver(Object o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Object o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
*/
    public void measurementsChanged() {
        setChanged(); // added
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
