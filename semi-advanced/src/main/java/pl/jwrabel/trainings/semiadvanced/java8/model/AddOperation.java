package pl.jwrabel.trainings.semiadvanced.java8.model;

/**
 * Created by jakubwrabel on 18.03.2017.
 */
public class AddOperation implements Operation {
	@Override
	public double evaluate(double x, double y) {
		return x+y;
	}
}
