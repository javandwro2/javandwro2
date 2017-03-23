package pl.jwrabel.trainings.semiadvanced.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class Customer {
	String firstName;
	String lastName;
	@JsonIgnore
	String id;
}
