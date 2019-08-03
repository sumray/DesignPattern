package design.factorymethod.pizzafm;

import java.util.ArrayList;

/**
 * @Title: Pizza
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 15:09
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>(); //配菜

    String getName(){
        return name;
    }

    void prepared(){
        System.out.println("Preparing pizza");
    }

    void cutting(){
        System.out.println("Cutting pizza");
    }

    void baking(){
        System.out.println("Baking pizza");
    }

    void boxing(){
        System.out.println("Boxing pizza");
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------").append(name).append("-------------\n");
        sb.append(dough).append("\n");
        sb.append(sauce).append("\n");
        for (String topping : toppings){
            sb.append(topping).append("\n");
        }
        return sb.toString();
    }
}
