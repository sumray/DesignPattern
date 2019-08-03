package design.decorate;

/**
 * @Title: Beverage
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 11:59
 */
public abstract class Beverage {
    String description;

    public abstract double cost();

    public String getDescription(){
        return description;
    }
}
