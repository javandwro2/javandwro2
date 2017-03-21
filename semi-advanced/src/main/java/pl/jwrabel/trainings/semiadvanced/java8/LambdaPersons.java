package pl.jwrabel.trainings.semiadvanced.java8;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jakubwrabel on 18.03.2017.
 */
public class LambdaPersons {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Adam", "Nowak", "Wrocław"));
		personList.add(new Person("Adam", "Kowalski", "Warszawa"));
		personList.add(new Person("Jerzy", "Polański", "Warszawa"));
		personList.add(new Person("Piotr", "Mickiewicz", "Sosnowiec"));
		personList.add(new Person("Jan", "Kowalski", "Wrocław"));


		// WYPISANIE TYLKO OSÓB Z WARSZAWY
		personList.stream().filter(p -> p.getCity().equals("Warszawa")).forEach(x -> System.out.println(x));


		personList.stream()
				.filter(p -> p.getCity().equals("Warszawa"))
				.map(p -> p.getFirstName() + " " + p.getLastName() + ", " + p.getCity())
				.forEach(x -> System.out.println(x));

		personList.stream().sorted((x, y) -> 0).forEach(x -> System.out.println(x));


		//1. Posortować Nazwisko, imię, miasto
		//2. Sprawdzenie, czy liczba jest liczbą pierwszą z użyciem lambd (IntStream)
		int x = 4;
		boolean isPrime = isPrime(x);
		System.out.println("Jest liczbą pierwszą " + isPrime);


		IntStream.range(2, 100).filter(y -> isPrime(y)).forEach(y -> System.out.println(y));

		IntStream.range(2, 100).filter(y -> IntStream
				.range(2, y / 2 + 1)
				.noneMatch(number -> y % number == 0)
		).forEach(y -> System.out.println(y));

		//3. W jednym ciągu wywołań -> wypisać wszystkie osoby, wypisać tylko z Warszawy w formacie Nazwisko Imię, WARSZAWA
		personList.stream()
				.peek(p -> System.out.println(p.getFirstName() + " " + p.getLastName()))
				.filter(p -> p.getCity().equals("Warszawa"))
				.map(p -> p.getLastName() + " " + p.getFirstName() + ", " + p.getCity().toUpperCase())
				.forEach(p -> System.out.println(p));

		// 4. z użyciem collectora joining wypisać osoby (stworzyć Stringa)
		// START
		// Adam Kowalski
		// ...
		// Piotr Kowalski
		// KONIEC
		String result = personList.stream()
				.map(p -> p.getFirstName() + " " + p.getLastName())
				.collect(Collectors.joining("\n", "START\n", "\nEND"));
		System.out.println(result);

		// 5. z użyciem summary statistics
		// podać średnią długość nazwisk osób
		IntSummaryStatistics intSummaryStatistics
				= personList.stream().mapToInt(p -> p.getLastName().length()).summaryStatistics();

		double avgLastNameLenght = intSummaryStatistics.getAverage();
		System.out.println("Srednia dlugosc nazwiska " + avgLastNameLenght);

		System.out.println("Srednia dlugosc nazwiska " + intSummaryStatistics.getAverage());

		// 6. Wypisać osoby w postaci
		// WARSZAWA
		// 	Adam Nowak
		// WROCŁAW
		//  Piotr Kowalski
		// 	Adam Kowalski
		Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(p -> p.getFirstName()));
//		collect.entrySet().stream()

	}

	private static boolean isPrime(int y) {
		return IntStream
				.range(2, y / 2 + 1)
				.noneMatch(number -> y % number == 0);
	}
}
