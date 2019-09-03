package design.compound.entity;

public class OldDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("我是只老了的鸭子，我竭尽全力的尖叫");
    }

    @Override
    public String toString() {
        return "OldDuck";
    }
}
