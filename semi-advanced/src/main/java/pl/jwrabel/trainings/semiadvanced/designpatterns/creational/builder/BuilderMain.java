package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.builder;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class BuilderMain {
	public static void main(String[] args) {
		Person person = new Person.Builder("Kowalski", "123")
				.withBirthYear(2001)
				.withHairColor("red")
				.build();

	}
}
