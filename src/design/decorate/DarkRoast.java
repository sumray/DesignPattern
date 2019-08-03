package design.decorate;

/**
 * @Title: DarkRoast
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 12:52
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.7;
    }
}
