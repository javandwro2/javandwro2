package pl.jwrabel.trainings.semiadvanced.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class Date implements Comparable {
	public static void main(String[] args) {
		List<Date> list = Arrays.asList(
				new Date(2015, 10, 10),
				new Date(2010, 10, 5),
				new Date(2010, 10, 3));

		System.out.println("Daty przed sortowaniem");
		list.forEach(x -> System.out.println(x));

		Collections.sort(list);

		System.out.println("Daty po sortowaniu");
		list.forEach(x -> System.out.println(x));


		list.stream().sorted((d1, d2) -> {
			if (d1.year == d2.year && d1.month == d2.month) {
				return Integer.compare(d2.day, d1.day);
			}
			if (d1.year == d2.year) {
				return Integer.compare(d2.month, d1.month);
			}
			return Integer.compare(d2.year, d1.year);

		}).forEach(x -> System.out.println(x));
	}

	private int year;
	private int month;
	private int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Date{" +
				"year=" + year +
				", month=" + month +
				", day=" + day +
				'}';
	}

	@Override
	public int compareTo(Object o) {
		if (o.getClass() == getClass()) {
			Date date2 = (Date) o;

			if (year == date2.year && month == date2.month) {
				return Integer.compare(day, date2.day);
//				if(day > date2.day){
//					return 1;
//				} else if (day == date2.day){
//					return 0;
//				} else {
//					return -1;
//				}
			}
			if (year == date2.year) {
				return Integer.compare(month, date2.month);
			}
			return Integer.compare(year, date2.year);


		}
		return -1;
	}
}
