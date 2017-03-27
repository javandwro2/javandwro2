package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.factory;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class Main {
	public static void main(String[] args) {
		Car car = new CamaroSS();
		car.drive();

		String name = "mustang";
		Car newCar = CarFactory.create(name);

	}
}
