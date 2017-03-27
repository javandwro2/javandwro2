package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.observer;

import pl.jwrabel.trainings.semiadvanced.json.Currency;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class ObserverMain {
	public static void main(String[] args) {
		Customer customer1 = new Customer("Adam Kowalski");
		Customer customer2 = new Customer("Piotr Adamski");

		Shop shop = new Shop();
		shop.registerObservator(customer1);
		shop.registerObservator(customer2);

		shop.discount();
	}
}
