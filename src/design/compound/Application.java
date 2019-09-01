package design.compound;


import design.compound.entity.BabyDuck;
import design.compound.entity.GreenDuck;
import design.compound.entity.OldDuck;
import design.compound.entity.Quackable;

public class Application {
	public static void main(String[] args) {
		Quackable baby = new BabyDuck();
		Quackable green = new GreenDuck();
		Quackable old = new OldDuck();
		baby.quack();
		green.quack();
		old.quack();
	}
}
