package design.state;

public class Application {

    public static void main(String[] args) {
        Order order = new Order();
        order.setName("拼少少");
        order.setPrice(100);
        
        TaoBao taobao = new TaoBao(order);
        taobao.receive();
        taobao.evaluate();
        taobao.pay();
        taobao.receive();
        taobao.deliver();
        taobao.receive();
        taobao.evaluate();
    }
}
