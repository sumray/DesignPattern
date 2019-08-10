package design.state;

public class UnpaidState implements OrderState {
    private Order order;

    public UnpaidState(Order order) {
        this.order = order;
    }

    @Override
    public boolean pay() {
        System.out.println("付款成功");
        return true;
    }

    @Override
    public boolean deliver() {
        System.out.println("尚未付款！无法发货");
        return false;
    }

    @Override
    public boolean receive() {
        System.out.println("尚未付款！无法收获");
        return false;
    }

    @Override
    public boolean evaluate() {
        System.out.println("尚未付款！无法评价");
        return false;
    }
}
