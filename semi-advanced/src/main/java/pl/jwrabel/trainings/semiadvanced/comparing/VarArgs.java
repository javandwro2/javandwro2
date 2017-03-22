package pl.jwrabel.trainings.semiadvanced.comparing;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jakubwrabel on 22.03.2017.
 */
public class VarArgs {
	public static void main(String[] args) {
		System.out.println("printNumbers(1);");
		printNumbers("A", 1);
		System.out.println("printNumbers(1,2);");
		printNumbers("B", 1, 2);
		System.out.println("printNumbers(1,2,3);");
		printNumbers("C", 1, 2, 3);
		System.out.println("printNumbers();");
		printNumbers("D");

	}

	public static void printNumbersArray(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public static void printNumbers(String prefix, int... numbers) {
		System.out.println(prefix);
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
