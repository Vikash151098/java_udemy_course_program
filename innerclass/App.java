package innerclass;

public class App {

	public static void main(String[] args) {
		Robot r = new Robot(5);
		r.start();

		// Robot.Brain br = r.new Brain();
		// br.think();

		Robot.Battery bt = new Robot.Battery();
		bt.charge();
	}

}
