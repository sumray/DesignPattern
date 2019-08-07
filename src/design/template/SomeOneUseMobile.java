package design.template;

/**
 * @Description: 子类2
 * @Auther: persona
 * @create 2019/8/7 15:42
 */
public class SomeOneUseMobile extends WatchJoJoTemplate{
    @Override
    void openMedia() {
        System.out.println("Joe打开了手机");
    }

    @Override
    void afterWatch() {
        System.out.println("Joe要闭眼睡觉了，Good Night");
    }
}
