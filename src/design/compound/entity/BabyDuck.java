package design.compound.entity;

public class BabyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("我是刚出生的鸭子，我还不会叫");
    }

    @Override
    public String toString() {
        return "BabyDuck";
    }
}
