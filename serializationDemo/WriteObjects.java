package serializationDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writting Objects...");
		Person mike = new Person(543, "mike");
		
		Person sue = new Person(112, "sue");

		System.out.println(mike);
		System.out.println(sue);

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"));) {

			os.writeObject(mike);
			os.writeObject(sue);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
