package design.template;

/**
 * @Description: 子类1
 * @Auther: persona
 * @create 2019/8/7 15:44
 */
public class SomeOneUseComputer extends WatchJoJoTemplate {
    @Override
    void openMedia() {
        System.out.println("Gio打开了电脑");
    }

    @Override
    void afterWatch() {
        System.out.println("Gio决定再玩会游戏....");
    }
}
