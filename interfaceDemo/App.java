package interfaceDemo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine();
		m1.start();

		Person p1 = new Person("Vikash");
		p1.greet();

		Info info1 = new Machine();
		info1.showInfo();

		Info info2 = new Person("amrit");
		info2.showInfo();

	}

}
