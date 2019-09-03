package design.compound.observer;

public interface QuackObservable {
	void registerObserver(QuackObserver observer);
	void notifyObservers();
}
