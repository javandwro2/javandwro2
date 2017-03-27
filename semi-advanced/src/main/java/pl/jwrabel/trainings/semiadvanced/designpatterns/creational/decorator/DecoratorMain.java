package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.decorator;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class DecoratorMain {
	public static void main(String[] args) {
		Car car = new RaceCar(new Mustang());

		car.drive();
	}
}
