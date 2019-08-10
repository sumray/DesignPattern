package design.state;

public class TaoBao {
    private OrderState unpaidState;
    private OrderState unshippedState;
    private OrderState unreceivedState;
    private OrderState receivedState;
    private OrderState curState;

    public TaoBao(Order order) {
        this.unpaidState = new UnpaidState(order);
        this.unshippedState = new UnshippedState(order);
        this.unreceivedState = new UnReceivedState(order);
        this.receivedState = new ReceivedState(order);
        this.curState = unpaidState;
    }

    public void pay(){
        boolean isSuccess = curState.pay();
        if (isSuccess){
            curState = unshippedState;
        }
    }
    
    public void deliver(){
        boolean isSuccess = curState.deliver();
        if (isSuccess){
            curState = unreceivedState;
        }
    }
    
    public void receive(){
        boolean isSuccess = curState.receive();
        if (isSuccess){
            curState = receivedState;
        }
    }
    
    public void evaluate(){
        boolean isSuccess = curState.evaluate();
    }
}
