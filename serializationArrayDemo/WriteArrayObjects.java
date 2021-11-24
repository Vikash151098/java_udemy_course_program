package serializationArrayDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteArrayObjects {

	public static void main(String[] args) {
		System.out.println("Writting Objects...");
		Person[] person = { new Person(543, "mike"), new Person(112, "sue"), new Person(1, "vikash") };

		ArrayList<Person> personList = new ArrayList<Person>(Arrays.asList(person));

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("peopleList.bin"))) {

			os.writeObject(person);
			os.writeObject(personList);
			os.writeInt(personList.size());
			for (Person p : personList) {
				os.writeObject(p);
			}

			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
