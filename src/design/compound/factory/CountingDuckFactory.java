package design.compound.factory;

import design.compound.decorate.QuackCounter;
import design.compound.entity.BabyDuck;
import design.compound.entity.GreenDuck;
import design.compound.entity.OldDuck;
import design.compound.entity.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
	@Override
	public Quackable createBabyDuck() {
		return new QuackCounter(new BabyDuck());
	}

	@Override
	public Quackable createGreenDuck() {
		return new QuackCounter(new GreenDuck());
	}

	@Override
	public Quackable createOldDuck() {
		return new QuackCounter(new OldDuck());
	}
}
