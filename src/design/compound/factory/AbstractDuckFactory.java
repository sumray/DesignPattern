package design.compound.factory;

import design.compound.entity.Quackable;

public abstract class AbstractDuckFactory {
	public abstract Quackable createBabyDuck();

	public abstract Quackable createGreenDuck();

	public abstract Quackable createOldDuck();
}
