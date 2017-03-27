package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.decorator;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class RaceCar implements Car {
	private Car car;

	public RaceCar(Car car) {
		this.car = car;
	}

	@Override
	public void drive() {
		System.out.println("Driving with race car");
		car.drive();
	}
}
