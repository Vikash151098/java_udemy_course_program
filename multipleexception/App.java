package multipleexception;

import java.io.IOException;
import java.text.ParseException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
