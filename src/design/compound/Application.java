package design.compound;


import design.compound.adapter.GooseAdapter;
import design.compound.combine.Flock;
import design.compound.decorate.QuackCounter;
import design.compound.entity.*;
import design.compound.factory.AbstractDuckFactory;
import design.compound.factory.CountingDuckFactory;
import design.compound.observer.QuackResearcher;

public class Application {
	public static void main(String[] args) {
		AbstractDuckFactory factory = new CountingDuckFactory();
		Quackable baby = factory.createBabyDuck();
		Quackable green = factory.createGreenDuck();
		Quackable old = factory.createOldDuck();
		Quackable goose = new GooseAdapter(new BabyGoose());

		Flock flock = new Flock();
		flock.add(baby);
		flock.add(green);
		flock.add(old);
		flock.add(goose);
		flock.registerObserver(new QuackResearcher());
		flock.quack();
		
		System.out.println("-----------------------------------");
		System.out.println("鸭子一共叫了几次呢？不包含鹅......");
		System.out.println("一共叫了" + QuackCounter.getCount() + "次");
	}
}
