package interfaceDemo;

public class Machine implements Info {
	private int id = 3;

	public void start() {
		System.out.println("Machine started");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine Id is: " + id);

	}
}
