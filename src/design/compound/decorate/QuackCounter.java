package design.compound.decorate;

import design.compound.entity.Quackable;

public class QuackCounter implements Quackable {
	private static int quackCount = 0;
	private Quackable quackable;
	
	public QuackCounter(Quackable quackable) {
		this.quackable = quackable;
	}

	@Override
	public void quack() {
		quackable.quack();
		quackCount++;
	}
	
	public static int getCount(){
		return quackCount;
	}

	@Override
	public String toString() {
		return quackable.toString();
	}
}
