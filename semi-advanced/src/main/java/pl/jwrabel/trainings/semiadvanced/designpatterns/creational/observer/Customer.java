package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.observer;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class Customer implements  Observator{
	String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void notifyObserver() {
		System.out.println("Customer " + name + " notified");
	}
}
