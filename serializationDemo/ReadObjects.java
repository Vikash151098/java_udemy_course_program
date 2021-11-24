package serializationDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects...");

		try (FileInputStream fs = new FileInputStream("people.bin"); ObjectInputStream os = new ObjectInputStream(fs)) {

			Person p1 = (Person) os.readObject();
			Person p2 = (Person) os.readObject();

			System.out.println(p1);
			System.out.println(p2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
