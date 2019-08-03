package design.decorate;

/**
 * @Title: Milk
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 13:02
 */
public class Milk extends Condiment{
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",with milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
