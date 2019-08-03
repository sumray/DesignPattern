package design.factorymethod.pizzas;

/**
 * @Title: Demo
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 16:39
 */
public class Demo {
    public static void main(String[] args) {
        String type = "cheese";
        PizzaStore ps = new PizzaStore();
        System.out.println(ps.order(type));
    }
}
