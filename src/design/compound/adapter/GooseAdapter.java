package design.compound.adapter;

import design.compound.entity.Goose;
import design.compound.entity.Quackable;

public class GooseAdapter implements Quackable {
	private Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.quack();
	}

	@Override
	public String toString() {
		return goose.toString();
	}
}
