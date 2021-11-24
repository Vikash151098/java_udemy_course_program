package serializationArrayDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadArrayObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects...");

		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("peopleList.bin"))) {

			Person[] p = (Person[]) os.readObject();

			@SuppressWarnings("unchecked")
			ArrayList<Person> pList = (ArrayList<Person>) os.readObject();

			for (Person person : p) {
				System.out.println(person);
			}
			for (Person person : pList) {
				System.out.println(person);
			}

			int num = os.readInt();
			for (int i = 0; i < num; i++) {
				Person person = (Person) os.readObject();
				System.out.println(person);
			}

			os.close();

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
