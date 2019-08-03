package design.factorymethod.pizzas;

/**
 * @Title: CheesePizza
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 16:09
 */
public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "芝士面团";
        sauce = "芝士酱";
        toppings.add("新鲜的芝士");
        toppings.add("菠菜");
    }
}
