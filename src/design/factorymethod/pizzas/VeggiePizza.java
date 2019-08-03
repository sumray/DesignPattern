package design.factorymethod.pizzas;

/**
 * @Title: VeggiePizza
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 16:07
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "硬面";
        sauce = "黑胡椒";
        toppings.add("胡萝卜");
        toppings.add("菠菜");
        toppings.add("青菜");
    }
}
