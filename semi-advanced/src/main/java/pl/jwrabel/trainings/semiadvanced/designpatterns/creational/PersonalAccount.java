package pl.jwrabel.trainings.semiadvanced.designpatterns.creational;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class PersonalAccount {

	public static void main(String[] args) {
		new PersonalAccount(new CreditAccountRatingStrategy(0.05));
	}
	RatingStrategy ratingStrategy;

	double amount = 1000;

	public PersonalAccount(RatingStrategy ratingStrategy) {
		this.ratingStrategy = ratingStrategy;
	}

	public double amountAfterOneYear(){
		return ratingStrategy.afterOneYear(amount);
	}
}
