package pl.jwrabel.trainings.semiadvanced.java8.model;

import java.util.List;
import java.util.Optional;

/**
 * Created by jakubwrabel on 21.03.2017.
 */
public class OptionalTest {
	public static void main(String[] args) {
		System.out.println(userName().orElse("Undefined"));

//		splitToLetters(Optional.ofNullable("s"));


		// metodę do liczenia miejsca zerowego funkcji kwadratowej
		// deltaX = b^2 - 4ac
		// x1 = (-b - sqrt(delta))/2a
		// x2 = (-b + sqrt(delta))/2a
	}

	public static Optional<List<Double>> findZeroValues(Optional<Double> a,Optional<Double> b,Optional<Double> c){
		return null;
	}

	public static Optional<String> userName() {
//		return Optional.of("Adam Kowalski");
		return Optional.ofNullable(null);
	}

	public static String[] splitToLetters(String text){
		if(text == null){
			text = "";
		}

//		return text.orElse("").split("");
//		return text.orElseThrow(() -> new IllegalArgumentException("MUSISZ PODAC TEKST")).split("");
		return new String[10];
	}
}
