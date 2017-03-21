package pl.jwrabel.trainings.semiadvanced.java8.model;

/**
 * Created by jakubwrabel on 21.03.2017.
 */
public class MyOptionalOfString {
	private String value;

	public String get(){
		return value;
	}

	public boolean isPresent(){
		return value != null;
	}
}

