package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.nullobject;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class OperationFactory {
	public static Operation create(String sign){
		if(sign.equals("+")){
			return new AddOperation();
		} else if (sign.equals("-")){
			return new SubtractOperation();
		}
		return new NullOperation();
	}
}
