package design.template;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/7 17:29
 */
public class BaiduThirdParty extends ThirdPartyTemplate {
    @Override
    String getThirdPartyUrl() {
        return "http://baidu.com";
    }

    @Override
    void afterSend(ThirdPartyResult result) {
        System.out.println("我是百度，这是回调函数：" + result.getCode() + "---" + result.getMsg());
    }
}
