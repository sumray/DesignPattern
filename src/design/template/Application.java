package design.template;

/**
 * @Description: 测试类
 * @Auther: persona
 * @create 2019/8/7 15:34
 */
public class Application {
    public static void main(String[] args) {
        WatchJoJoTemplate joe = new SomeOneUseMobile();
        WatchJoJoTemplate gio = new SomeOneUseComputer();
        joe.watch();
        System.out.println("----------------------------------");
        gio.watch();
    }
}
