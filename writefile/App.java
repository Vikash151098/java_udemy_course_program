package writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file = new File("output.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("this is a line one");
			bw.newLine();
			bw.write("this is a second line");
			bw.newLine();
			bw.write("this is a third ");
			bw.newLine();
			bw.write("vikash kumar");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
