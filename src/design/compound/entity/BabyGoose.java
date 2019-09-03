package design.compound.entity;

public class BabyGoose extends Goose{
	@Override
	public void quack() {
		System.out.println("我是一只刚出生的鹅，我在努力学习尖叫");
	}

	@Override
	public String toString() {
		return "BabyGoose";
	}
}
