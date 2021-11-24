package abstractDemo;

public class App {

	public static void main(String[] args) {
		Camera c1 = new Camera();
		c1.setId(3);
		System.out.println(c1.getId());
//		c1.start();
		c1.run();

		Car car = new Car();
		car.setId(6);
		System.out.println(car.getId());
//		car.start();
		car.run();

//		Machine m = new Machine();
//		m.setId(id);

	}

}
