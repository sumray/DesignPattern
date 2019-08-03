package design.decorate;

/**
 * @Title: Demo
 * @Description: TODO
 * @Auther: sumray
 * @Date 2019/1/2 14:25
 */
public class Demo {
    public static void main(String[] args) {
        Beverage bev = new Coco(new Milk(new DarkRoast()));
        System.out.println(bev.getDescription());
        System.out.println(bev.cost());  //存在二进制误差

        Beverage bev2 = new Milk(new Moca(new HouseBlend()));
        System.out.println(bev2.getDescription());
        System.out.println(bev2.cost());
    }
}
