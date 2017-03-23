package pl.jwrabel.trainings.semiadvanced.json;

/**
 * Created by jakubwrabel on 23.03.2017.
 */
public class WeatherInside {
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WeatherInside{" +
				"description='" + description + '\'' +
				'}';
	}
}
