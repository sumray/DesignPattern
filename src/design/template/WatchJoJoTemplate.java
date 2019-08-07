package design.template;

/**
 * @Description: 观看jojo的模板方法父类
 * @Auther: persona
 * @create 2019/8/7 15:39
 */
public abstract class WatchJoJoTemplate {
    public final void watch(){
        this.openMedia();
        this.openWebPage();
        this.watchTheAnime();
        this.afterWatch();
    }

    abstract void openMedia();

    private void openWebPage(){
        System.out.println("打开了bilibili");
    }

    private void watchTheAnime(){
        System.out.println("正在观看JOJO的奇妙冒险：命运是沉睡的奴隶");
    }

    abstract void afterWatch();
}
