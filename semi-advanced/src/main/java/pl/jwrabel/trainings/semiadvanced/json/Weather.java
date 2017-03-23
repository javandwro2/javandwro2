package pl.jwrabel.trainings.semiadvanced.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jakubwrabel on 23.03.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
