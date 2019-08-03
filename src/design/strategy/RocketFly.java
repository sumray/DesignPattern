package design.strategy;

/**
 * @Title: RocketFly
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2018/12/3 0:19
 */
public class RocketFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly with rocket!!");
    }
}
