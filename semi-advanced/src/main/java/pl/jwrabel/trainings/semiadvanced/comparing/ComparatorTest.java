package pl.jwrabel.trainings.semiadvanced.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class ComparatorTest {
	public static void main(String[] args) {
		List<Point> points = Arrays.asList(new Point(6, 3), new Point(1, 5), new Point(4, 1), new Point(6, 1));
		System.out.println("Lista punktów przed sortowaniem");
		points.forEach(x -> System.out.println(x));

		points.sort(new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				if(p1.getX()>p2.getX()){
					return 1;
				} else if (p1.getX() == p2.getX()){
					return 0;
				} else {
					return -1;
				}
			}
		});

		points.sort((p1, p2) -> {
			if(p1.getX()>p2.getX()){
				return 1;
			} else if (p1.getX() == p2.getX()){
				return 0;
			} else {
				return -1;
			}
		});


		System.out.println("Lista punktów po sortowaniu");
		points.forEach(x -> System.out.println(x));

//		points.stream().max((p1,p2) -> )
//		points.stream().min((p1,p2) -> )

		Point p1 = new Point(100, 200);
		Point p2 = new Point(100, 300);

	}
}
