package pl.jwrabel.trainings.semiadvanced.json;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by jakubwrabel on 23.03.2017.
 */
public class Currency {
	private String base;

	@JsonProperty(value = "date_a")
	private String date;

	private Map<String, Double> rates;

	@Override
	public String toString() {
		return "Currency{" +
				"base='" + base + '\'' +
				", date='" + date + '\'' +
				", rates=" + rates +
				'}';
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Map<String, Double> getRates() {
		return rates;
	}

	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}
}
