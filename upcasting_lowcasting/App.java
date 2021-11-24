package upcasting_lowcasting;

class Machine {
	public void start() {
		System.out.println("machine start.");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("camera starts");
	}

	public void snap() {
		System.out.println("camera take snap");
	}
}

public class App {

	public static void main(String[] args) {
		Machine m1 = new Machine();
		Camera c1 = new Camera();
		m1.start();
		c1.start();
		c1.snap();

		// Upcasting
		System.out.println("upcasting..........");
		Machine m2 = c1;
		m2.start();
		// error m2.snap();
		Camera c = (Camera) m2;
		c.snap();
		c.start();

		// downcasting
		System.out.println("downcasting........");
		Machine m3 = new Camera();
		Camera c2 = (Camera) m3;
		c2.start();
		c2.snap();

		Machine m4 = new Machine();
		// doesn't work runtime error
//		Camera c3 = (Camera) m4;
//		c3.snap();
//		c3.start();

	}

}
