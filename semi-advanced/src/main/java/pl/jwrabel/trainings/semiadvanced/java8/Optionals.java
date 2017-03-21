package pl.jwrabel.trainings.semiadvanced.java8;

import java.awt.*;
import java.awt.Point;
import java.util.Optional;

/**
 * Created by jakubwrabel on 21.03.2017.
 */
public class Optionals {
	public static void main(String[] args) {
		// TWORZENIE OPTIONAL
		// 1. Optional.empty()
		Optional<Object> emptyOptional = Optional.empty();
		// 2. Optional.of(...)
		String a = "A";
		Optional<String> optional2 = Optional.of(a);
		java.awt.Point point = new java.awt.Point();
		java.awt.Point pointNull = null;
//        Optional<Point> point1 = Optional.of(pointNull); // wywali, bo pointNull === null
		// 3. Optional.ofNullable(...)
		Optional<String> optional3 = Optional.ofNullable("ab");
		Optional<java.awt.Point> optional31 = Optional.ofNullable(pointNull);



		String nullString = null;
		String ab = new String();

		Optional<String> testOptional = Optional.ofNullable(" ");
		// METODY OPTIONALI
		// 1. isPresent
		boolean isNotNull = testOptional.isPresent();

		java.awt.Point nullPoint = null;
		java.awt.Point nonNullPoint = new java.awt.Point();

		Optional<java.awt.Point> nonNullOptional = Optional.of(nonNullPoint);
		Optional<java.awt.Point> nullOptional = Optional.ofNullable(nullPoint);

		boolean present = nullOptional.isPresent(); // present == false
		boolean present1 = nonNullOptional.isPresent(); // present == true

		// 2. get


		if (point != null) {
			point.getX();
		}

		if (nonNullOptional.isPresent()) {
			java.awt.Point point1 = nonNullOptional.get();
			point1.getX();
		}

		if (testOptional.isPresent()) {
			String value = testOptional.get();
			value.charAt(1);
		}


		// 3. orElse
		String s11 = null;
		String value2 = Optional.ofNullable(s11).orElse(new String());

		java.awt.Point point1 = new java.awt.Point(100, 200);
		Optional<java.awt.Point> pointOptional = Optional.ofNullable(point1);
		java.awt.Point valueOfPoint = pointOptional.orElse(new Point());

		// 4. orElseGet
		String value3 = testOptional.orElseGet(() -> System.lineSeparator());


		// 5. orElseThrow
		String valu4 = testOptional.orElseThrow(() -> new IllegalArgumentException());

		// 6. filter
		String value5 = testOptional.filter(x -> !x.isEmpty()).orElse("BLA");

		String firstName = "Axxxxxx";
		Optional<String> firstName1 = Optional.ofNullable(firstName);
		firstName1.filter(x -> x.startsWith("A")).orElse("Default");

//        if(firstName != null){
//            if(firstName.startsWith("A")){
//                return firstName;
//            }
//            return "Default";
//        }
//        return "Default";

		// 7. map
		Optional<Double> bytes = pointOptional.map(x -> x.getX());


		// 8. ifPresent(Consumer)
		testOptional.ifPresent(x -> System.out.println(x));


		// 9. flatMap (map na metodzie zwracającej nulla)
//        Optional<U> b = Optional.ofNullable(Optional.of("B")).flatMap(x -> x.get());


	}
}
