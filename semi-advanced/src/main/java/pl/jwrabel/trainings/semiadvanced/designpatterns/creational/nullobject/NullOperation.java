package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.nullobject;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class NullOperation implements  Operation{
	@Override
	public double evaluate(double x, double y) {
		System.out.println("Do nothin'");
		return x;
	}
}
