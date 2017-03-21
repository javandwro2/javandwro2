package pl.jwrabel.trainings.javandwro2;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.Files;
import com.google.common.io.MoreFiles;
import com.google.common.io.Resources;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;

import java.io.*;
import java.net.URL;
import java.util.List;

/**
 * Created by jakubwrabel on 11.03.2017.
 */
public class Streams {
	public static void main(String[] args) throws IOException {
		// System.out -> PrintStream
		System.out.println("Hello World");

		// System.err -> PrintStream
		System.err.println("MyError!!!");

		// System.in -> InputStream
//		int read = System.in.read();
//		System.out.println("Read variable " + read);


		// FileOutputStream
		FileOutputStream fout = new FileOutputStream("testFOS.txt");
//		FileOutputStream fout=new FileOutputStream("test.txt", true);
		fout.write(65);
		fout.write("abc".getBytes());
		fout.close();

		// FileInputStream
		FileInputStream fin = new FileInputStream("testFIS.txt");
//		int i = fin.read();
//		System.out.println("read: " + (char) i);
		int i = 0;
		while ((i = fin.read()) != -1) {
			System.out.println("read: " + (char) i);
		}
		fin.close();


		// BufferedOutputStream
		fout = new FileOutputStream("testBOS.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Lorem ipsum";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();

		// BufferedInputStream
		System.out.println("--- BUFFERED INPUT STREAM ---");
		fin = new FileInputStream("testBIN.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);
		}
		bin.close();
		fin.close();
		System.out.println();


		// System.console
//		System.console().readLine();


		// File writer
		// File reader
		// BufferedFileWriter
		// BufferedFileReader

		// URL
		InputStream inputStream = new URL("http://www.wp.pl").openStream();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		byte[] bytes = new byte[1024];
		bufferedInputStream.read(bytes);
		System.out.println(new String(bytes));


		// GUAVA Files
		Files.append("BLA", new File("test.txt"), Charsets.UTF_8);
		CharSink charSink = Files.asCharSink(new File("text.txt"), Charsets.UTF_8);
//		charSink.write();
//		charSink.writeLines();
//		Files.toString()
//		Files.touch();
//		Files.copy();
//		Files.move();
//		Files.readLines()
		List<String> strings = Resources.readLines(new URL("http://wp.pl"), Charsets.UTF_8);
		for (String string : strings) {
			System.out.println(string);
		}

//		Resources.toString(Resources.getResource("test.txt"), Charsets.UTF_8);
//		MoreFiles.deleteRecursively();


		// APACHE COMMONS IO
		// https://commons.apache.org/proper/commons-io/
//		FileUtils.readLines()
		LastModifiedFileComparator lastModifiedFileComparator = new LastModifiedFileComparator();
//		lastModifiedFileComparator.sort();
		// FileMonitor
		// FileSystemUtils

		String s1 = IOUtils.toString(new URL("http://wp.pl").openStream());
		System.out.println(s1);


		// String.format
		System.out.println("---- STRING FORMAT ---");
		int intNumber = 10;
		double doubleNumber = 10.33;
		String text = "ABC";
		System.out.println(String.format("a variable: %d, b variable %f text String: %s", intNumber, doubleNumber, text));
	}
}
