package pl.jwrabel.trainings.semiadvanced.designpatterns.creational;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class SingletonLazyInit {

	private static SingletonLazyInit INSTANCE = null;

	private SingletonLazyInit(){

	}

	public static SingletonLazyInit getInstance(){
		if(INSTANCE == null){
			INSTANCE = new SingletonLazyInit();
		}

		return INSTANCE;
	}
}
