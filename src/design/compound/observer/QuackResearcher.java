package design.compound.observer;


public class QuackResearcher implements QuackObserver {
	@Override
	public void update(QuackObservable observable) {
		System.out.println(observable + "在叫！");
	}
}
