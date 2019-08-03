package design.observer;

/**
 * @Title: TemperatureElement
 * @Description: TODO
 * @Auther: Sumray
 * @Date 2018/12/28 17:14
 */
public class TemperatureElement implements Observer{
    private Subject weatherData;
    private float temp;

    public TemperatureElement(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temp = temp;
    }

    public void display(){
        System.out.println("I'm temperatureElement, now temp is " + temp);
    }
}
