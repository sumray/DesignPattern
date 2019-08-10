package design.state;

public class UnshippedState implements OrderState {
    private Order order;

    public UnshippedState(Order order) {
        this.order = order;
    }

    @Override
    public boolean pay() {
        System.out.println("您已付款过了！");
        return false;
    }

    @Override
    public boolean deliver() {
        System.out.println("发货成功！");
        return true;
    }

    @Override
    public boolean receive() {
        System.out.println("尚未发货！无法收货");
        return false;
    }

    @Override
    public boolean evaluate() {
        System.out.println("尚未发货！无法评价");
        return false;
    }
}
