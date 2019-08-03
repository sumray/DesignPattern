package design.decorate;

/**
 * @Title: HouseBlend
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 12:52
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
