package pl.jwrabel.trainings.semiadvanced.designpatterns.creational;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class Singleton {

	private static final Singleton INSTANCE = new Singleton();

	private Singleton(){

	}

	public static Singleton getInstance(){
		return INSTANCE;
	}
}
