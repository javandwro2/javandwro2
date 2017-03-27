package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubrwrabel on 27.03.2017.
 */
public class Shop {
	List<Observator> observators = new ArrayList<>();

	public void discount(){
		observators.forEach(x -> x.notifyObserver());
	}

	public void registerObservator(Observator observator){
		observators.add(observator);
	}
}
