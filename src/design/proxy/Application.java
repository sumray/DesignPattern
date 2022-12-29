package design.proxy;

/**
 * @Description: TODO
 * @Auther: persona
 * @create 2019/8/23 17:01
 */
public class Application {

    public static void main(String[] args) {
        CertService service = new CertService();
        String myca = service.apply(1L, "myca");
        System.out.println(myca);
        String myca2 = service.apply(1L, "myca");
        System.out.println(myca2);
        String sheca = service.apply(2L, "sheca");
        System.out.println(sheca);
    }

}
