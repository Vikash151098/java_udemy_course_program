package inheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine();
		m1.start();
		System.out.println(m1.name);
		m1.stop();

		Car c1 = new Car();
		c1.start();
		c1.windWings();
		c1.showInfo();
		c1.stop();
		System.out.println(c1.name);


	}

}
