package design.template;

/**
 * @Description: 测试类
 * @Auther: persona
 * @create 2019/8/7 15:34
 */
public class Application {
    public static void main(String[] args) {
        TencentThirdParty tencent = new TencentThirdParty();
        BaiduThirdParty baidu = new BaiduThirdParty();
        System.out.println("--------------------------------------");
        tencent.invoke();
        baidu.invoke();
    }
}
