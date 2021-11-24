package innerclass;

public class Robot {
	private int id;

	private class Brain {
		public void think() {
			System.out.println("robot " + id + " is thinking");
		}
	}

	static class Battery {
		public void charge() {
			System.out.println("battery charging..");
		}
	}

	public Robot(int id) {
		super();
		this.id = id;
	}

	public void start() {
		System.out.println("starting robot " + id);
		Brain b = new Brain();
		b.think();

		String name = "Robort";

		class Temp {
			public void dosomething() {
				System.out.println("Id is " + id);
				System.out.println("my name is " + name);

			}
		}

		Temp t = new Temp();
		t.dosomething();
		
	}

}
