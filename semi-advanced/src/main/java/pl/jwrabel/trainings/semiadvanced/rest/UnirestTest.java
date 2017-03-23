package pl.jwrabel.trainings.semiadvanced.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

/**
 * Created by jakubwrabel on 23.03.2017.
 */
public class UnirestTest {
	public static void main(String[] args) throws UnirestException {
		String body = Unirest.get("http://46.101.150.244:8080/hi").asString().getBody();
		System.out.println(body);
		String body2 = Unirest.get("http://46.101.150.244:8080/helloPathParam/Wojtek").asString().getBody();
		System.out.println(body2);

		String body3 = Unirest.get("http://46.101.150.244:8080/helloRequestParam?name=Andrzej").asString().getBody();
		System.out.println(body3);

		String customers = Unirest.get("http://46.101.150.244:8080/customers").asString().getBody();
		System.out.println(customers);

		// WPIĘCIE JACKSONA W UNIRESTA
		Unirest.setObjectMapper(new ObjectMapper() {
			private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
					= new com.fasterxml.jackson.databind.ObjectMapper();

			public <T> T readValue(String value, Class<T> valueType) {
				try {
					return jacksonObjectMapper.readValue(value, valueType);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}

			public String writeValue(Object value) {
				try {
					return jacksonObjectMapper.writeValueAsString(value);
				} catch (JsonProcessingException e) {
					throw new RuntimeException(e);
				}
			}
		});




	}
}
