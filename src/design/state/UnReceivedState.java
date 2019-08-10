package design.state;

public class UnReceivedState implements OrderState {
    private Order order;

    public UnReceivedState(Order order) {
        this.order = order;
    }

    @Override
    public boolean pay() {
        System.out.println("您已付款过了！");
        return false;
    }

    @Override
    public boolean deliver() {
        System.out.println("该商品已经发货！");
        return false;
    }

    @Override
    public boolean receive() {
        System.out.println("收货成功！");
        return true;
    }

    @Override
    public boolean evaluate() {
        System.out.println("尚未收货！无法评价");
        return false;
    }
}
