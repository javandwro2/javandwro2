package pl.jwrabel.trainings.semiadvanced.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jakubwrabel on 23.03.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	private String name;
	private List<WeatherInside> weather;

	public List<WeatherInside> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherInside> weather) {
		this.weather = weather;
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Weather{" +
				"name='" + name + '\'' +
				", weather=" + weather +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}
}
