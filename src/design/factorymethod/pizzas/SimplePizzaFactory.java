package design.factorymethod.pizzas;

/**
 * @Title: SimplePizzaFactory
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 16:27
 */
public class SimplePizzaFactory {
    public static Pizza getPizza(String type){
        if ("clam".equals(type)){
            return new ClamPizza();
        }
        if ("cheese".equals(type)){
            return new CheesePizza();
        }
        if ("veggie".equals(type)){
            return new VeggiePizza();
        }
        return null;
    }
}
