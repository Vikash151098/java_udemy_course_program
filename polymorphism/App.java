package polymorphism;

public class App {

	public static void main(String[] args) {
		Tree t = new Tree();
		t.grow();

		Plant p = t;
		p.grow();
	}

}
