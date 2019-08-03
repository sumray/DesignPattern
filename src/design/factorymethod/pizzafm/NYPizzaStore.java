package design.factorymethod.pizzafm;

import design.factorymethod.pizzas.CheesePizza;
import design.factorymethod.pizzas.ClamPizza;
import design.factorymethod.pizzas.VeggiePizza;

/**
 * @Title: NYPizzaStore
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 17:11
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if ("clam".equals(type)){
            return new NYStyleClamPizza();
        }
        if ("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }
        return null;
    }

}
