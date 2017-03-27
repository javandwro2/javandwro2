package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.designpattern.structural;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class PointFactory {
	private static Set<Point> points = new HashSet<>();

	public static Point create(int x, int y) {

		Optional<Point> existingPoint = points.stream().filter(p -> p.getX() == x && p.getY() == y).findFirst();

//		return existingPoint.orElseGet( () -> {
//			Point p = new Point(x,y);
//			points.add(p);
//			return p;
//		});

		if(existingPoint.isPresent()){
			return existingPoint.get();
		}

		Point point = new Point(x, y);
		points.add(point);
		return point;
	}
}
