package pl.jwrabel.trainings.semiadvanced.designpatterns.creational;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class CreditAccountRatingStrategy implements RatingStrategy {
	double rate;

	public CreditAccountRatingStrategy(double rate) {
		this.rate = rate;
	}

	@Override
	public double afterOneYear(double amount) {
		return amount*(1-rate);
	}
}
