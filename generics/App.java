package generics;

import java.util.ArrayList;
import java.util.HashMap;

class Machine {

	@Override
	public String toString() {
		return "machine starting";
	}

	public void run() {
		System.out.println("running.....");
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "camera starting";
	}

	public void snap() {
		System.out.println("snap taken");
	}
}

class Animal {

}

public class App {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("mango");

		String fruit = (String) list.get(1);
		System.out.println(fruit);

		ArrayList<String> str = new ArrayList<String>();
		str.add("cat");
		str.add("dog");
		str.add("alligator");

		String animal = str.get(1);
		System.out.println(animal);

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		ArrayList<Animal> a = new ArrayList<Animal>();
		a.add(new Animal());

		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());

		showList(list1);
		showList(list2);
		showList2(list2);
		showList3(list2);
	}

	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine data : list) {
			System.out.println(data);
			data.run();
		}
	}

	public static void showList2(ArrayList<? super Camera> list) {
		for (Object data : list) {
			System.out.println(data);

		}
	}

	public static void showList3(ArrayList<?> list) {
		for (Object data : list) {
			System.out.println(data);

		}
	}

}
