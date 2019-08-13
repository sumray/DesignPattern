package design.template;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/7 17:31
 */
public class TencentThirdParty extends ThirdPartyTemplate {
    @Override
    String getThirdPartyUrl() {
        return "http://www.qq.com";
    }

    @Override
    void afterSend(ThirdPartyResult result) {
        System.out.println("我是企鹅，这是回调函数：" + result.getCode() + "---" + result.getMsg());
    }
}
