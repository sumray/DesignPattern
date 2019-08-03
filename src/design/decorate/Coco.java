package design.decorate;

/**
 * @Title: Coco
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 12:46
 */
public class Coco extends Condiment{
    private Beverage beverage;

    public Coco(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",with Coco";
    }
}
