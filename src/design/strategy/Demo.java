package design.strategy;

/**
 * @Title: Demo
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2018/12/3 0:26
 */
public class Demo {
    public static void main(String[] args) {
        Duck d = new RocketDuck();
        d.display();

        d.setFlyBehavior(new FlyNoWay());
        d.display();
    }
}
