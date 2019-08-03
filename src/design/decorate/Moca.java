package design.decorate;

/**
 * @Title: Moca
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 13:23
 */
public class Moca extends Condiment{
    private Beverage beverage;

    public Moca(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",with Moca";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.7;
    }
}
