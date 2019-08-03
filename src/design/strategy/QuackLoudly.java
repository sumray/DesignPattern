package design.strategy;

/**
 * @Title: QuackLoudly
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2018/12/3 0:20
 */
public class QuackLoudly implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can quack loudly!");
    }
}
