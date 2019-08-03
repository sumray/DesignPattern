package design.factorymethod.pizzafm;

/**
 * @Title: PizzaStore
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 17:03
 */
public abstract class PizzaStore {
    public Pizza order(String type){
        Pizza pizza = createPizza(type);

        pizza.prepared();
        pizza.cutting();
        pizza.boxing();
        pizza.baking();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
