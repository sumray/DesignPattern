package design.sington;

/**
 * @Title: SingtonPattern
 * @Description: TODO
 * @Auther:
 * @Version: 1.0
 * @create 2019/3/23 11:00
 */
public class SingtonPattern {
    //volatile防止同步问题
    private volatile static SingtonPattern obj;

    private SingtonPattern() {}

    public static SingtonPattern getInstance(){
        if (obj == null){//第一次检测是否非空，否则会一直执行synchronized
            synchronized (SingtonPattern.class){
                if (obj == null){//第二次检测是否非空，否则扔会出现多次new对象的问题
                    obj = new SingtonPattern();
                }
            }
        }
        return obj;
    }
}
