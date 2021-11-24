package accessmodifier2;

import accessmodifier1.App;
import accessmodifier1.Machine;

public class Application extends Machine {

	public static void main(String[] args) {
		App app = new App();
		System.out.println(app.name);
//		Application a = new Application();
		Machine m = new Machine();
		System.out.println(m.id);

	}

}
