package pl.jwrabel.javandwro2.cars.threading;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.03.2017.
 */
public class Threads2 {
	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();


		final List<Integer> ints = new ArrayList<>();

		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {
					synchronized (obj) {
						ints.add(i);
					}
				}
			}
		};
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {
					synchronized (obj) {
						ints.add(i);
					}
				}
			}
		};

		thread1.start();
		thread2.start();
		thread1.stop();
		thread1.join();
		thread2.join();

		System.out.println("Rozmiar listy " + ints.size());

		// -
		// \
		// |
		// /
		// -
		// \
		// ...

	}
}
