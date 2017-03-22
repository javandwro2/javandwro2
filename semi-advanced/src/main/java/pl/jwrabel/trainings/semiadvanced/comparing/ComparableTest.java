package pl.jwrabel.trainings.semiadvanced.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class ComparableTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 2, 7, 1);

		System.out.println("Przed sortowaniem");
		list.forEach(x -> System.out.println(x));
//		list.forEach(System.out::println);

		Collections.sort(list);
		System.out.println("Po sortowaniu");
		list.forEach(x -> System.out.println(x));

		List<Point> points = Arrays.asList(new Point(6, 3), new Point(1, 5), new Point(4, 1), new Point(6, 1));
		System.out.println("Lista punktów przed sortowaniem");
		points.forEach(x -> System.out.println(x));

		Collections.sort(points);
		System.out.println("Lista punktów po sortowaniu");
		points.forEach(x -> System.out.println(x));

	}
}
