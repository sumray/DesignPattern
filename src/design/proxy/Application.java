package design.proxy;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 17:01
 */
public class Application {
    public static void main(String[] args) {
        UserService service =  new UserServiceImpl();
        ProxyFactory factory = new ProxyFactory(service);
        UserService proxyService = (UserService) factory.get();
        proxyService.getName();
    }
}
