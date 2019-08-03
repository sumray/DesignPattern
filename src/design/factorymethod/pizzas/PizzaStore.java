package design.factorymethod.pizzas;

/**
 * @Title: PizzaStore
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 16:14
 */
public class PizzaStore {
    public Pizza order(String type){
        Pizza pizza = SimplePizzaFactory.getPizza(type);

        pizza.prepared();
        pizza.cutting();
        pizza.boxing();
        pizza.baking();

        return pizza;
    }
}
