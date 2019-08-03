package design.strategy;

/**
 * @Title: RocketDuck
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2018/12/3 0:21
 */
public class RocketDuck extends Duck {
    public RocketDuck() {
        setFlyBehavior(new RocketFly());
        setQuackBehavior(new QuackLoudly());
    }

    @Override
    public void display() {
        System.out.println("I'm a rocketDuck");
        performFly();
        performQuack();
    }
}
