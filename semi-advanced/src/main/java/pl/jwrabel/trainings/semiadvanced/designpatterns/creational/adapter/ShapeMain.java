package pl.jwrabel.trainings.semiadvanced.designpatterns.creational.adapter;

import sun.security.provider.SHA;

/**
 * Created by jakubwrabel on 27.03.2017.
 */
public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = new ShapeAdapter(new Line());
		Shape shape2 = new ShapeAdapter(new Rectangle());

		shape.draw(0,0,1,1);
		shape2.draw(0,0,1,1);
	}
}
