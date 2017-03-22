package pl.jwrabel.trainings.semiadvanced.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import pl.jwrabel.trainings.semiadvanced.comparing.Point;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class Jackson {
	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		// włączenie formatowania wyjścia
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		// ZAMIANA OBIEKTU NA JSON
		Place place = new Place("Dom", "Warszawa", Arrays.asList(new Point(100, 200)));
		String placeJson = objectMapper.writeValueAsString(place);
		System.out.println(placeJson);

		// ZAPIS JSONA DO PLIKU
		objectMapper.writeValue(new File("placeJackson.json"), place);

		String placeAsJson = "{\n" +
				"  \"name\" : \"Dom\",\n" +
				"  \"city\" : \"Warszawa\",\n" +
				"  \"points\" : [ {\n" +
				"    \"x\" : 100,\n" +
				"    \"y\" : 200\n" +
				"  } ]\n" +
				"}";

		// ZAMIANA JSONA NA OBIEKT
		Place placeReader = objectMapper.readValue(placeAsJson, Place.class);

		// ZAMIANA JSONA Z PLIKU NA OBIEKT
		Place placeReaded = objectMapper.readValue(new File("cust.json"), Place.class);

		String jsonString = "{\"firstName\":\"Adam\",\"lastName\":\"Kowalski\",\"birthYear\":1980,\"idNumber\":\"ABC\"}";

	}
}
