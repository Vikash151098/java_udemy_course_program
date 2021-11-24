package inheritance;

public class Car extends Machine {

	@Override
	public void start() {

		System.out.println("car started");

	}

	public void windWings() {
		System.out.println("wind wings startedddd..");
	}

	public void showInfo() {
		System.out.println("car name:" + name);
	}
}
