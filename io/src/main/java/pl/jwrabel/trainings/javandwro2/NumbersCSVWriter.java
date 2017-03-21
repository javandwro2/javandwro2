package pl.jwrabel.trainings.javandwro2;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 11.03.2017.
 */
public class NumbersCSVWriter {
	public static void main(String[] args) throws IOException {

		CharSink charSink = Files.asCharSink(new File("numbers.csv"), Charsets.UTF_8, FileWriteMode.APPEND);
		for (int i = 1; i <= 100; i++) {
			if (i == 100) {
				charSink.write("" + i);
			} else {
				charSink.write("" + i + ",");
			}
		}

		// LUB
		List<String> numbers = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			numbers.add("" + i);
		}

		String join = Joiner.on(",").join(numbers);
		charSink.write(join);
	}
}
