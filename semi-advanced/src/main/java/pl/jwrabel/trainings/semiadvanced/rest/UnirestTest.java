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
		// Zapytanie - odpowiedź = String (Hello World from Jakub)
		String simpleResponse = Unirest.get("http://46.101.150.244:8080/hi").asString().getBody();
		System.out.println(simpleResponse);

		// Zapytanie z użyciem Path variable/Path param -> zwraca Stringa (Hello World from Jakub + <PARAMETR>)
		String responseFromPathVariableQuery = Unirest.get("http://46.101.150.244:8080/helloPathParam/Piotr").asString().getBody();
		System.out.println(responseFromPathVariableQuery);

		// Zapytanie z użyciem Request param -> zwraca Stringa (Hello World from Jakub + <PARAMETR_NAME>)
		String responseFromRequestParamQuery = Unirest.get("http://46.101.150.244:8080/helloRequestParam?name=Andrzej").asString().getBody();
		System.out.println(responseFromRequestParamQuery);

		// Zapytanie z użyciem 2 Request param -> zwraca Stringa (Hello World from Jakub + <PARAMETR_NAME> + <PARAMETR_SURNAME>)
		String responseFrom2RequestParamQuery = Unirest.get("http://46.101.150.244:8080/hello?name=Jakub&surname=Wrabel").asString().getBody();
		System.out.println(responseFrom2RequestParamQuery);

		// Zapytanie zwracające wszystkich customerów jako JSONA (Stringa)
		String customersJson = Unirest.get("http://46.101.150.244:8080/api/v1/customers").asString().getBody();
		System.out.println(customersJson);

		// WPIĘCIE JACKSONA W UNIRESTA - umożliwia autmatyczną zamianę JSONów na obiekty w Unireście (i obiektów na JSONy)
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

		// Pobranie jednego klienta (o ID string) i automatyczna zamiana
		// odpowiedzi serwera (JSONa z klientem) na obiekt klasy Customer
		Customer returnedCustomer = Unirest.get("http://46.101.150.244:8080/api/v1/customers/string").asObject(Customer.class).getBody();
		System.out.println(returnedCustomer);

		// Pobranie wszystkich klientów i automatyczna zamiana
		// odpowiedzi serwera (JSONa z kolekcją klientów) na tablicę obiektów klasy Customer
		Customer[] customersArray = Unirest.get("http://46.101.150.244:8080/api/v1/customers").asObject(Customer[].class).getBody();
		System.out.println(customersArray);


		// Utworzenie i wysłanie POSTem nowego klienta do serwera (Tworzenie klienta)
		Customer customer = new Customer();
		customer.setBirthYear("1799");
		customer.setHeight(1.89);
		customer.setFirstName("Piotr");
		customer.setLastName("Kowalski");
		customer.setId(UUID.randomUUID().toString());

		String postResponse = Unirest
				.post("http://46.101.150.244:8080/api/v1/customers")
				.header("Content-Type", "application/json")
				.body(customer).asString().getBody();

		System.out.println(postResponse);


	}
}
