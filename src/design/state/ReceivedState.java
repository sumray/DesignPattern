package design.state;

public class ReceivedState implements OrderState {
    private Order order;
    
    public ReceivedState(Order order) {
        this.order = order;
    }

    @Override
    public boolean pay() {
        System.out.println("无需付费");
        return false;
    }

    @Override
    public boolean deliver() {
        System.out.println("无需发货");
        return false;
    }

    @Override
    public boolean receive() {
        System.out.println("已经收到货，无需再次收获");
        return false;
    }

    @Override
    public boolean evaluate() {
        System.out.println("感谢您的评价");
        return true;
    }
}
