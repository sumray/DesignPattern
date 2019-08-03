package design.factorymethod.pizzafm;


/**
 * @Title: Demo
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 17:13
 */
public class Demo {
    public static void main(String[] args) {
        PizzaStore nys = new NYPizzaStore();
        PizzaStore chica = new ChicagoPizzaStore();

        System.out.println(nys.order("cheese"));
        System.out.println(chica.order("cheese"));
    }

}
