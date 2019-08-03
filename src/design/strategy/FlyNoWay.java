package design.strategy;

/**
 * @Title: FlyNoWay
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2018/12/3 0:20
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly T T");
    }
}
