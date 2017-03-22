package pl.jwrabel.trainings.semiadvanced.comparing;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class Point implements Comparable {
	private int x;
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@SuppressWarnings("unused")
	public Point(){

	}

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
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
				", y=" + y +
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
		if (o.getClass() == getClass()) {
			Point point2 = (Point) o;

//			int value = Integer.compare(x, point2.x);
//			if(value == 0){
//				return Integer.compare(y, point2.y);
//			}
//			return value;

			if (x == point2.getX()) {
				if (y > point2.getY()) {
					return 1;
				} else if (y == point2.getY()) {
					return 0;
				} else {
					return -1;
				}
			}

			if (x > point2.getX()) {
				return 1;
			} else {
				return -1;
			}


		} else {
			return -1;
		}
	}
}

