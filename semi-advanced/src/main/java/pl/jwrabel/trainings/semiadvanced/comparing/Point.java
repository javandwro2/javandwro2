package pl.jwrabel.trainings.semiadvanced.comparing;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class Point implements Comparable {
	private int x;

	public Point(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Point{" +
				"x=" + x +
				'}';
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	// X i Y
	// X < Y -> Coś < 0
	// X == Y ->  0
	// X > Y ->  Coś > 0
	public int compareTo(Object o) {
		if(o.getClass() == getClass()){
			Point point2 = (Point)o;

			if(x > point2.getX()){
				return 1;
			} else if (x == point2.getX()){
				return 0;
			} else {
				return -1;
			}


		} else {
			return -1;
		}
	}
}

