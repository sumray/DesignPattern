package design.factorymethod.pizzafm;

/**
 * @Title: ChicagoPizzaStore
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 17:12
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if ("clam".equals(type)){
            return new ChicagoStyleClamPizza();
        }
        if ("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
