package design.compound.factory;

import design.compound.entity.BabyDuck;
import design.compound.entity.GreenDuck;
import design.compound.entity.OldDuck;
import design.compound.entity.Quackable;

public class DuckFactory extends AbstractDuckFactory{
	@Override
	public Quackable createBabyDuck() {
		return new BabyDuck();
	}

	@Override
	public Quackable createGreenDuck() {
		return new GreenDuck();
	}

	@Override
	public Quackable createOldDuck() {
		return new OldDuck();
	}
}
