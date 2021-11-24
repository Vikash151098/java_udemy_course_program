package handlingexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		try {
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println("file not found exception");
//			e.printStackTrace();
		}
	}

	public static void readFile() throws FileNotFoundException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}

}
