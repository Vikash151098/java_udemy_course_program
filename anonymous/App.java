package anonymous;

class Machine {
	public void start() {
		System.out.println("machine starting..");
	}
}

interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine() {
			@Override
			public void start() {
				System.out.println("camera starting..");
			}
		};
		m1.start();

		Plant p1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("plant growing..");
			}
		};
		p1.grow();

	}

}
