package design.factorymethod.pizzas;

/**
 * @Title: ClamPizza
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 16:12
 */
public class ClamPizza extends Pizza{
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "瘦面团";
        sauce = "白胡椒";
        toppings.add("蛤蜊");
        toppings.add("芝士");
    }
}
