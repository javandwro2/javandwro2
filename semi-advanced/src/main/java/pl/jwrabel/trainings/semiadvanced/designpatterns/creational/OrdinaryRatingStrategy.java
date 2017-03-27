package pl.jwrabel.trainings.semiadvanced.designpatterns.creational;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class OrdinaryRatingStrategy implements RatingStrategy {
	@Override
	public double afterOneYear(double amount) {
		return amount;
	}
}
