package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.nullobject;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class SubtractOperation implements  Operation{
	@Override
	public double evaluate(double x, double y) {
		return x - y;
	}
}
