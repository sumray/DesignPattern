package design.template;

/**
 * @Description: 第三方接口业务类
 * @Auther: persona
 * @create 2019/8/7 17:18
 */
public abstract class ThirdPartyTemplate {
    public final void invoke(){
        String url = this.getThirdPartyUrl();
        ThirdPartyResult result = this.sendHttpRequest(url);
        this.afterSend(result);     //此处为hook函数
        this.record(result);
    }

    abstract String getThirdPartyUrl();

    abstract void afterSend(ThirdPartyResult result);

    private ThirdPartyResult sendHttpRequest(String url){
        if (url == null || url.length() == 0){
            throw new RuntimeException("参数为空");
        }
        System.out.println("Http向" + url + "发送了一次请求");
        ThirdPartyResult result = new ThirdPartyResult();
        result.setCode("100");
        result.setMsg("调用成功");
        return result;
    }

    private void record(ThirdPartyResult result){
        System.out.println("do some insert operation.....");
    }
}
