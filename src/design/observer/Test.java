package design.observer;

/**
 * @Title: Test
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2018/12/30 18:31
 */
public class Test {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        TemperatureElement element = new TemperatureElement(data);
        element.display();
        data.updateMeasurements(10, 20, 30);
        element.display();
    }
}
