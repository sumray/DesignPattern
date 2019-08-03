package design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: WeatherData
 * @Description: TODO
 * @Auther: sumray
 * @Date 2018/12/28 17:13
 */
public class WeatherData implements Subject{
    private float temp;
    private float pressure;
    private float humidity;

    private List<Observer> obsList;

    public WeatherData() {
        obsList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        if (o != null)
            obsList.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        if (o != null)
            obsList.remove(o);
    }

    public void updateMeasurements(float temp, float pressure, float humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;

        measurementChanged();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : obsList){
            o.update(temp, pressure, humidity);
        }
    }

    private void measurementChanged(){
        notifyObservers();
    }
}
