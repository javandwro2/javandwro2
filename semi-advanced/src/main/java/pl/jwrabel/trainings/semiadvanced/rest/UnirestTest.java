package pl.jwrabel.trainings.semiadvanced.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.body.RequestBodyEntity;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by jakubwrabel on 23.03.2017.
 */
public class UnirestTest {
	public static void main(String[] args) throws UnirestException {
		String body = Unirest.get("http://46.101.150.244:8080/hi").asString().getBody();
		System.out.println(body);

		// Path variable/Path param
		String body2 = Unirest.get("http://46.101.150.244:8080/helloPathParam/Piotr").asString().getBody();
		System.out.println(body2);

		// Request param
		String body3 = Unirest.get("http://46.101.150.244:8080/helloRequestParam?name=Andrzej").asString().getBody();
		System.out.println(body3);


		String customers = Unirest.get("http://46.101.150.244:8080/api/v1/customers").asString().getBody();
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

		Customer cust = Unirest.get("http://46.101.150.244:8080/api/v1/customers/d02b625f-29b8-4e9b-b980-f3967ec6db5c").asObject(Customer.class).getBody();
		System.out.println(cust);

		Customer[] customersArray = Unirest.get("http://46.101.150.244:8080/api/v1/customers").asObject(Customer[].class).getBody();
		System.out.println(customersArray);

		Customer customer = new Customer();
		customer.setBirthYear("1799");
		customer.setHeight(1.89);
		customer.setFirstName("Piotr");
		customer.setLastName("Kowalski");
		customer.setId(UUID.randomUUID().toString());

		String response = Unirest
				.post("http://46.101.150.244:8080/api/v1/customers")
				.header("Content-Type", "application/json")
				.body(customer).asString().getBody();

		System.out.println(response);



	}
}
