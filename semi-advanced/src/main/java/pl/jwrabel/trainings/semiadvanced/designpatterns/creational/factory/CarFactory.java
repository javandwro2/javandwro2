package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.factory;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class CarFactory {
	public static Car create(String name) {
		if (name.equals("mustang")) {
			return new Mustang();
		} else {
			return new CamaroSS();
		}

		// ABSTRACT FACTORY
	}
}
