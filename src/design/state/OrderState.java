package design.state;

public interface OrderState {
    boolean pay();

    boolean deliver();

    boolean receive();

    boolean evaluate();
}
