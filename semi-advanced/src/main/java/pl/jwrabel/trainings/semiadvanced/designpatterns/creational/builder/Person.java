package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.builder;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class Person {
	private String firstName;
	private String lastName; // REQUIRED
	private String id; // PESEL - REQUIRED
	private double weight;
	private int birthYear;
	private String hairColor;


	public static class Builder{
		private String firstName;
		private String lastName;
		private String id;
		private double weight;
		private int birthYear;
		private String hairColor;

		public Builder(String lastName, String id) {
			this.lastName = lastName;
			this.id = id;
		}

		public Builder withFirstName(String firstName){
			this.firstName = firstName;
			return this;
		}

		public Builder withWeight(double weight){
			this.weight = weight;
			return this;
		}

		public Builder withBirthYear(int birthYear){
			this.birthYear = birthYear;
			return this;
		}

		public Builder withHairColor(String color){
			this.hairColor = color;
			return this;
		}

		public Person build(){
			Person person = new Person();
			person.id = id;
			person.firstName = firstName;
			person.lastName = lastName;
			person.weight = weight;
			person.birthYear = birthYear;
			person.hairColor = hairColor;
			return person;
		}
	}
}
