package design.compound.combine;

import design.compound.entity.Quackable;
import design.compound.observer.QuackObservable;
import design.compound.observer.QuackObserver;

import java.util.ArrayList;
import java.util.List;

public class Flock implements QuackObservable {
	private List<Quackable> quackableList;
	private List<QuackObserver> observerList;
	
	public Flock() {
		quackableList = new ArrayList<>();
		observerList = new ArrayList<>();
	}

	public void add(Quackable quackable){
		quackableList.add(quackable);
	}
	
	public void quack(){
		for (Quackable quackable : quackableList){
			quackable.quack();
		}
		this.notifyObservers();
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void notifyObservers() {
		for (QuackObserver observer : observerList) {
			observer.update(this);
		}
	}

	@Override
	public String toString() {
		return "Flock{" +
				"quackableList=" + quackableList +
				'}';
	}
}
